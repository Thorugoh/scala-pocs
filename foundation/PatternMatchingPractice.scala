import scala.io.StdIn
@main
def patternMatchingPractice(): Unit = {
    println("How many meals do you have per day?")
    val meals = 3

    meals match
        case x if 0 to 2 contains meals => println("You should eat more")
        case 3 => println("That's perfect")
        case _ => println("You should eat less")

    val name = "alex"
    name(0).toUpper match
        case 'A' | 'B' | 'C' => println(s"Hello $name, welcome!")
        case x if 'D' to 'H' contains name(0) => println(s"Hi $name, how are you?")
        case _ => println("Hi")


    val currentHour = 6
    currentHour match
        case x if 6 to 11 contains currentHour => println("morning")
        case x if 12 to 14 contains currentHour => println("noon")
        case x if 15 to 17 contains currentHour => println("afternoon")
        case x if 18 to 21 contains currentHour => println("evening")
        case _  => println("night")
        
    
    
}