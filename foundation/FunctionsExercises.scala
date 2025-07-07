import scala.io.StdIn
@main
def functionsExercises(): Unit = {
    for(i <- 1 to 10)
        printHello()
    
    for(j <- 1 to 3)
        multiplyNumber()
}

def printHello(): Unit = {
    println("Hi, how are you?")
}

def multiplyNumber(): Unit = {
    println("Please input a number")
    val number = StdIn.readInt()
    println(s"$number * 17 = ${number * 17}")
}