import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should.Matchers

class EntryCodecSpec extends AsyncFlatSpec with Matchers:
  import ByteDecoder.*

  "EntryCodecSpec" should "encode and decode an entry correctly" in {

    val key = "Victor"
    val value = "Fox".getBytes("UTF-8")
    val timestamp = 1620000000
    val crc = 12345678

    val encoded = EntryCodec.encodeEntry(key, value, timestamp, crc)

    // Get First 14 Bytes (Header) and decode
    val decodedHeader = EntryHeader.decode(encoded.take(14))
    val decodedKey = encoded.slice(14, 14 + decodedHeader.keySize).toUtf8String
    val decodedValue = encoded.slice(14 + decodedHeader.keySize, decodedHeader.totalSize)

    decodedHeader.crc shouldEqual crc
    decodedHeader.timestamp shouldEqual timestamp
    decodedHeader.keySize shouldEqual key.getBytes("UTF-8").length
    decodedHeader.valueSize shouldEqual value.length

    decodedKey shouldEqual key
    decodedValue shouldEqual value
  }
