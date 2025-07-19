import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should.Matchers

class EntryHeaderSpec extends AsyncFlatSpec with Matchers:
  "EntryHeader" should "encode header" in {
    val header = EntryHeader(
      crc = 0x12345678,
      timestamp = 0xDEADBEEF,
      keySize = 42,
      valueSize = 123456
    )

    val encoded = EntryHeader.encode(header)
    encoded.length shouldBe 14

    val decoded = EntryHeader.decode(encoded)
    decoded shouldBe header
  }

  it should "handle edge values correctly" in {
    val header = EntryHeader(
      crc = Int.MaxValue,
      timestamp = Int.MinValue,
      keySize = Short.MaxValue,
      valueSize = 0
    )

    val encoded = EntryHeader.encode(header)
    encoded.length shouldBe 14

    val decoded = EntryHeader.decode(encoded)
    decoded shouldBe header
  }

  it should "produce consistent byte layout" in {
    val header = EntryHeader(
      crc = 0x01020304,
      timestamp = 0x05060708,
      keySize = 0x090A.toShort,
      valueSize = 0x0B0C0D0E
    )

    val encoded = EntryHeader.encode(header)

    encoded.toList shouldBe List(
      0x04, 0x03, 0x02, 0x01, // CRC LE
      0x08, 0x07, 0x06, 0x05, // Timestamp LE
      0x0A, 0x09, // Key Size LE
      0x0E, 0x0D, 0x0C, 0x0B // Value Size LE
    ).map(_.toByte)
  }
