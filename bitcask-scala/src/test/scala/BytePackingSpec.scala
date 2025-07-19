import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should.Matchers

class BytePackingSpec extends AsyncFlatSpec with Matchers:
  import BytePacking.*

  "toBytesLE" should "correctly convert Int to little-endian bytes" in {
    val bytes = 0x12345678.toBytesLE

    // Int should have 4 bytes
    bytes.length shouldBe 4
    /*
    * 0x78 -> LSB (Least Significant Bit)
    * 0x56 -> Next byte
    * 0x34 -> Next byte
    * 0x12 -> MSB (Most Significant Bit)
    * */
    bytes shouldEqual Array(0x78, 0x56, 0x34, 0x12).map(_.toByte)
  }

  it should "handle zero correctly" in {
    val bytes = 0.toBytesLE
    bytes shouldEqual Array(0, 0, 0, 0).map(_.toByte)
  }

  it should "handle negative numbers correctly" in {
    val number = -1
    val bytes = number.toBytesLE
    bytes shouldEqual Array(0xff.toByte, 0xff.toByte, 0xff.toByte, 0xff.toByte)
  }

  "toBytesLE (Short)" should "convert Short to little-endian bytes" in {
    val value: Short = 0x1234
    value.toBytesLE shouldEqual Array(0x34, 0x12).map(_.toByte)
  }

  "toBytesLE (Long)" should "convert Long to little-endian bytes" in {
    val value: Long = 0x0102030405060708L
    value.toBytesLE shouldEqual Array(0x08, 0x07, 0x06, 0x05, 0x04, 0x03, 0x02, 0x01).map(_.toByte)
  }

  "toBytes (String)" should "convert String to UTF-8 bytes" in {
    val str = "Victor 🦊"
    // Output: 56 69 63 74 6F 72 20 [F0 9F A6 8A]
    //         V  i  c  t  o  r  Spc (Emoji takes 4 bytes)
    str.toBytes shouldEqual str.getBytes("UTF-8")
  }

  "pack" should "combine multiple byte arrays into one" in {
    val a1 = Array[Byte](0x01, 0x02)
    val a2 = Array[Byte](0x03)
    val a3 = Array[Byte](0x04, 0x05)
    pack(a1, a2, a3) shouldEqual Array(0x01, 0x02, 0x03, 0x04, 0x05).map(_.toByte)
  }