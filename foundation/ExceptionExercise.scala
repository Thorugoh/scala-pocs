import scala.io.StdIn
@main
def exceptionExercise(): Unit = {
    println("Please enter a number")
    val input = StdIn.readLine()

    try {
        val number = input.toInt
        println(s"$number * 5 = ${number * 5}")
    }catch {
        case e: NumberFormatException => {
            println(s"The value '$input' is not a number" )
            e.printStackTrace()
        }
    }

}