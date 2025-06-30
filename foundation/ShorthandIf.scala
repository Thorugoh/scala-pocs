import scala.io.StdIn
@main
def shorthandIf(): Unit = {
    println("Please enter a number")
    val number = StdIn.readInt()
    var isEven: String = null

    isEven = if(number % 2 == 0) "Number is even" else "Number is odd"

    println(isEven)

    
}