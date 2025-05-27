import scala.io.StdIn
@main
def userInputExercise(): Unit = {
    // println("What is your name?")
    // val name = StdIn.readLine()
    // println(s"Hello $name")

    println("Please enter a number")
    val number = StdIn.readInt()
    println(number * 2)

}