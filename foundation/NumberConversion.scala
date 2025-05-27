import scala.io.StdIn
@main
def numberConversion(): Unit = {
    print("Enter a number: ")
    val number = StdIn.readLine()

    println(number.toInt.getClass())

    val multiplier = 2.5

    println((number.toInt * multiplier).getClass())
}