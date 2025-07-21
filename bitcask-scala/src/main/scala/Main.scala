import java.nio.file.{Paths}

@main def bitcaskCli(key: String, value: String, filePath: String): Unit =
  val path = Paths.get(filePath)
  val timestamp = (System.currentTimeMillis / 1000).toInt

  val writer = BitcaskWriter.open(path)
  writer.append(key.getBytes("UTF-8"), value.getBytes("UTF-8"), timestamp)
  writer.flush()
  writer.close()

  println(s"Wrote key='$key', value='$value' at $filePath")

