object BytePacking:
  // Given the value 305419896 (0x12345678), its binary representation is:
  // [byte3]    [byte2]    [byte1]    [byte0]
  // 00010010   00110100   01010110   01111000

  extension (i: Int) def toBytesLE: Array[Byte] =
    Array(
      // Extract byte0 (least significant byte)
      // 00010010 00110100 01010110 [01111000]
      (i &0xff).toByte,
      // Shift right 8 bits to bring byte1 to lowest position, then mask
      // 00000000 00010010 00110100 [01010110]
      ((i >> 8) &0xff).toByte,
      // Shift right 16 bits to bring byte2 to lowest position, then mask
      // 00000000 00000000 00010010 [00110100]
      ((i >> 16) &0xff).toByte,
      // Shift right 24 bits to bring byte3 (most significant) to lowest position, then mask
      // 00000000 00000000 00000000 [00010010]
      ((i >> 24) &0xff).toByte
    )

  extension (s: Short) def toBytesLE: Array[Byte] =
    Array(
      (s &0xff).toByte,
      ((s >> 8) &0xff).toByte,
    )

  extension (l: Long) def toBytesLE: Array[Byte] =
    // Idiomatic way to convert a Long to an array of 8 bytes in little-endian order.
    // Array.tabulate(8)(...) creates an array of size 8.
    // For each index i (from 0 to 7), it shifts the long `l` right by (i * 8) bits,
    // masks it with 0xff to extract the lowest byte, and converts it to Byte.
    //
    // That gives us:
    // byte0 = (l >> 0)  & 0xff
    // byte1 = (l >> 8)  & 0xff
    // ...
    // byte7 = (l >> 56) & 0xff
    //
    // This results in little-endian encoding:
    // least significant byte first, most significant last.
    Array.tabulate(8)(i => ((l >> (i * 8)) & 0xff).toByte)

  extension (str: String) def toBytes: Array[Byte] =
    str.getBytes("UTF-8")

  def pack(parts: Array[Byte]*): Array[Byte] =
    parts.flatten.toArray