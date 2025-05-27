import scala.io.StdIn
import java.time.LocalDateTime

@main
def calcAge(): Unit = {
    println("Enter your birth year")
    val birthYear = StdIn.readInt()
    val age = LocalDateTime.now.getYear() - birthYear

    print(s"You are $age yo.")
}