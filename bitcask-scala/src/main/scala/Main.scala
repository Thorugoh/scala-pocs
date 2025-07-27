import EntryCodec.encodeEntry

import java.io.RandomAccessFile
import java.nio.file.Paths
import scala.collection.mutable

@main def cli(): Unit =
  val cli = BitcaskCLI("/Users/user/data.log")
  cli.put("name1", "John")
  cli.put("name2", "Mary")

  val data = cli.get("name3")
  print(data)



case class ValueData(fileId: String, valueSize: Int, valuePos: Int, timestamp: Int)

class BitcaskCLI(filePath: String):
  private val keyDir: mutable.Map[String, ValueData] = mutable.Map()
  private var writePos: Int = 0

  def put(key: String, value: String): Unit = {
    val writer: BitcaskWriter = BitcaskWriter.open(Paths.get(filePath))

    val timestamp = (System.currentTimeMillis / 1000).toInt
    val (entry, header) = encodeEntry(key.getBytes("UTF-8"), value.getBytes("UTF-8"), timestamp)

    val valueData = ValueData(filePath, header.valueSize, writePos + EntryHeader.HeaderSize + header.keySize, timestamp)
    updateWritePos(EntryHeader.HeaderSize + header.keySize + header.valueSize)

    writer.append(entry)
    keyDir.addOne((key, valueData))

    writer.flush()
    writer.close()
  }

  def get(key: String): String =
    import ByteDecoder.*
    val data = keyDir.get(key)
    val raf = RandomAccessFile(filePath, "r")
    val buffer = new Array[Byte](data.get.valueSize)
    raf.seek(data.get.valuePos)
    raf.readFully(buffer)

    buffer.toUtf8String


  def updateWritePos(pos: Int): Int =
    writePos += pos
    writePos