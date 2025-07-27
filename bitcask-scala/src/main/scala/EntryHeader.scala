
val CRC_SIZE = 4
val TIMESTAMP_SIZE = 4
val KEY_SIZE = 2
val VALUE_SIZE = 4

case class EntryHeader(
  crc: Int,
  timestamp: Int,
  keySize: Short,
  valueSize: Int
) {

  import EntryHeader.HeaderSize

  def totalSize: Int = HeaderSize + keySize + valueSize
}


object EntryHeader {
  import BytePacking.*
  import ByteDecoder.*

  val HeaderSize: Int = CRC_SIZE + TIMESTAMP_SIZE + KEY_SIZE + VALUE_SIZE

  def encode(header: EntryHeader): Array[Byte] =
    BytePacking.pack(
      header.crc.toBytesLE,
      header.timestamp.toBytesLE,
      header.keySize.toBytesLE,
      header.valueSize.toBytesLE
    )

  def decode(bytes: Array[Byte]): EntryHeader =
    val crc = bytes.slice(0, 4).toIntLe
    val timestamp = bytes.slice(4, 8).toIntLe
    val keySize = bytes.slice(8, 10).toShortLE
    val valueSize = bytes.slice(10, 14).toIntLe

    EntryHeader(crc,timestamp, keySize, valueSize)
}
