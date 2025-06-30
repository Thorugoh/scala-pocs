import scala.io.StdIn
@main
def expressions(): Unit = {
    if(326 / 72 * 15 + 93 % 13 == 65)
        println("Math is hard")
    else
        println("Math is easy")

    val haveCat = true
    val haveCatFood = true
    if(haveCatFood && haveCat)
        println("Cat is happy")
    else 
        println("Oh no")

    println("What is your age?")
    val age = StdIn.readInt()
    if(age >= 18)
        println("Can drink alchohol")
    else 
        println("Illegal to drink alcohol")
}