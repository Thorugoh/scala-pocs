import scala.io.StdIn


@main
def userInput(): Unit = {
    println("Type something")
    val input = StdIn.readLine()
    println(input)

    val number = input.toInt
    print(number * 2)
}