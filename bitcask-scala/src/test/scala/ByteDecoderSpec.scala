import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should.Matchers

class ByteDecoderSpec extends AsyncFlatSpec with Matchers:
  import ByteDecoder.*


  "toIntLe" should "be 0x12345678" in {
    val arr: Array[Byte] = Array(0x78, 0x56, 0x34, 0x12).map(_.toByte)
    arr.toIntLe shouldEqual 0x12345678
  }

  "toShortLE" should  "be 0x1234" in {
    val arr: Array[Byte] = Array(0x34, 0x12).map(_.toByte)
    arr.toShortLE shouldEqual 0x1234.toShort
  }

  "toLongLE" should "convert little-endian bytes to Long" in {
    val value: Array[Byte] = Array(0x08, 0x07, 0x06, 0x05, 0x04, 0x03, 0x02, 0x01)
    value.toLongLE shouldEqual 0x0102030405060708L
  }

  "toUtf8String" should "convert Byte Array to UTF-8 String" in {
    val str: Array[Byte] = Array(0x56, 0x69, 0x63, 0x74, 0x6F, 0x72, 0x20, 0xF0, 0x9F, 0xA6, 0x8A).map(_.toByte)
    str.toUtf8String shouldEqual "Victor 🦊"
  }