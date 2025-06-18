@main
def operators(): Unit = {
    println(5 + 2) // Addition
    println("Hi " + "Victor")
    println(8 - 4) // Subtraction
    println(7 * 3) // Multiplication
    println(7 / 2) // Division of integers returns integers
    println(7 / 2d) // Division of different types get the highest type
    println(7 % 2) // Module or remainder (get the rest of the / operation)
    println(15 % 6)

}