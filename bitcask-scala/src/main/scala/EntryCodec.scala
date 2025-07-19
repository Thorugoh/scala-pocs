case class Entry(header: EntryHeader, key: String, value: Array[Byte])

object EntryCodec:
  import BytePacking.*
  import ByteDecoder.*

  def encodeEntry(key: String, value: Array[Byte], timestamp: Int, crc: Int = 0): Array[Byte] =
    val keyBytes: Array[Byte] = key.toBytes
    val header = EntryHeader(
      crc = crc,
      timestamp = timestamp,
      keySize = keyBytes.length.toShort,
      valueSize = value.length
    )
    val encodedHeader = EntryHeader.encode(header)
    pack(encodedHeader, keyBytes, value)

  def decodeEntry(bytes: Array[Byte]): Entry =
    val header = EntryHeader.decode(bytes.slice(0, 14))
    val keyStart = 14
    val keyEnd = keyStart + header.keySize
    val valueEnd = keyEnd + header.valueSize

    val keyBytes = bytes.slice(keyStart, keyEnd)
    val valueBytes = bytes.slice(keyEnd, valueEnd)

    Entry(header, keyBytes.toUtf8String, valueBytes)
