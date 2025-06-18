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



    // Result Type gets always the larges type
    val a: Short = 4
    val b: Int = 372
    val r = a * b

    println(r) // 1488
    println(r.getClass()) // int

    val a2 = 9897878789l
    val b2 = 232.4578f
    val r2 = a2 / b2

    println(r2) // 4.257925E7
    println(r2.getClass()) //float

    val a3 = 23234.4323f
    val b3 = 23.3555 // double by default
    val r3 = a3 * b3

    println(r3)
    println(r3.getClass()) // double

    // Assignment Operator
    var dozen = 12
    val months = dozen

    dozen = 13
   
    println(dozen) // 13
    println(months) // 12

    // Reference Operator
    val username = "victor"
    val greeting = s"Hello $username"
    println(greeting)


    // Reference expression
    val products = 3
    val price = 9.99
    val total = s"Your total is $$${products * price}"
    println(total)
}