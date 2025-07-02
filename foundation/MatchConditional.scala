import scala.io.StdIn
import scala.util.Random

@main
def matchStatement(): Unit = {
    println("Type an animal")
    val input = "rabbit"

    var action = ""
    input match
        case "dog" | "hamster" | "rabbit" => action = "pet it"
        case "cat" => action = "feed it"
        case "crocodile" => action = "run away"
        case _ => action = "google it"

    println(s"When you see a $input you $action")

    // Example 2
    val number = Random().nextInt(100)
    number % 2 match
        case 0 => println("Number is even")
        case 1 => println("Number is odd")

    // Match Lists
    val numbers = List(1,2,3)
    numbers match
        case List(1, 2, 3) => println("single digits")
        case List(10, 11, 12) => println("double digits")
        case _ => println("Unknown")

    // Matching tuples
    val animalFeed = ("cat", "catFood")
    animalFeed match
        // _ will match first element on tuple and watever comes after it
        case ("cat", _) => println("cat info")
        case ("dig", _) => println("dog info")
        case _ => println("random tuple")
    
    
    
}