import java.nio.file.Paths
import scala.collection.mutable
@main def bitcaskCli(key: String, value: String, filePath: String): Unit =
  val path = Paths.get(filePath)
  val timestamp = (System.currentTimeMillis / 1000).toInt

  val writer = BitcaskWriter.open(path)
  writer.append(key.getBytes("UTF-8"), value.getBytes("UTF-8"), timestamp)
  writer.flush()
  writer.close()

  println(s"Wrote key='$key', value='$value' at $filePath")


case class ValueData(fileId: String, valueSize: Int, valuePos: Int, timestamp: Int)

case class BitcaskCLI(filePath: String):
  private val keyDir: mutable.Map[String, ValueData] = mutable.Map()
  private val writer: BitcaskWriter = BitcaskWriter.open(Paths.get(filePath))

  def put(key: String, value: String): Unit = {
    val timestamp = (System.currentTimeMillis / 1000).toInt

    val header = writer.append(key.getBytes("UTF-8"), value.getBytes("UTF-8"), timestamp)
    val valueData = ValueData(filePath, header.valueSize, header.keySize + 14, timestamp)
    keyDir.addOne((key, valueData))
  }

  def get(key: String): String =
    val data = keyDir.get(key)

    ""
