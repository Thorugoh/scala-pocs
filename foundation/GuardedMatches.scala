import scala.util.Random
@main
def patternMathcinGuards(): Unit = {
    val weekday = "Monday"
    val isItAm = false
    weekday match
        case "Saturday" if isItAm => println("Sleep in")
        case "Sunday" if isItAm => println("Do chores")
        case "Saturday" | "Sunday" if !isItAm => println("Go out and have fun")
        case _ => println("Go to work")

    // Range matching

    val number = Random.nextInt(20)
    number match
        case x if 0 until 10 contains number => println(s"Single digit $x")
        case y if 10 until 20 contains number => println(s"Double digit $y")
        case _  => println("Large number")
    
    
}