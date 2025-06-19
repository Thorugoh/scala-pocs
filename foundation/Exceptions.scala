import scala.io.StdIn

@main
def exceptions(): Unit = {
    val input = StdIn.readLine()
    
    try {
        val number = input.toInt
    } catch {
        case f: NumberFormatException => {
            println("Number format exception ocurred")
            println(f.printStackTrace())
        }
        case e: Exception => {
            println("Exeception ocurred")
        }
    } finally {
        println("Rsource utilization has completed. Free up all resources")
    }

    println("Continuing execution")
}