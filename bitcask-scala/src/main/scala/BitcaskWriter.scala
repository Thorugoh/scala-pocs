import java.io.{BufferedOutputStream, FileOutputStream}
import java.nio.file.{Files, Path}

object BitcaskWriter:
  def open(path: Path): BitcaskWriter =
    val file = path.toFile
    if !file.exists then Files.createFile(path)
    val fos = FileOutputStream(file, true)
    val bos = BufferedOutputStream(fos)
    BitcaskWriter(bos)


class BitcaskWriter(val bos: BufferedOutputStream):
  import EntryCodec.*

  def append(key: String, value: Array[Byte], timestamp: Int): Unit =
    val entry = encodeEntry(key, value, timestamp)
    bos.write(entry)

  def flush(): Unit = bos.flush()
  def close(): Unit = bos.close()




