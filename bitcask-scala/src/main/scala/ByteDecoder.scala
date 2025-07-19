object ByteDecoder:
  extension (bytes: Array[Byte]) def toIntLe: Int =
    // Decodes a 4-byte little-endian array into an Int
    // bytes(0) was the least significant byte (LSB), it stays at the lowest bits
    // bytes(1) is shifted left by 8 bits
    // bytes(2) is shifted left by 16 bits
    // bytes(3) was the most significant byte (MSB), now shifted to highest 8 bits
    // & 0xff makes sure each byte is treated as unsigned before shift
    // | combines them together into a single Int
      (bytes(0) & 0xff) |
      ((bytes(1) & 0xff) << 8) |
      ((bytes(2) & 0xff) << 16) |
      ((bytes(3) & 0xff) << 24)

  extension (bytes: Array[Byte]) def toShortLE: Short =
    ((bytes(0) & 0xff) | ((bytes(1) &0xff) << 8)).toShort


  extension (bytes: Array[Byte]) def toLongLE: Long =
    bytes.zipWithIndex.map((byte, index) => ((byte &0xffL) << 8 * index)).reduce(_ | _)

  extension (bytes: Array[Byte]) def toUtf8String: String = new String(bytes, "UTF-8")


