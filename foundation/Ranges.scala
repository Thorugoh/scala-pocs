// A collection that contais all the ements between two fiven values
@main 
def ranges(): Unit = {
    var r1 = 1 to 10
    println(r1.toList)

    val r2 = 'a' to 'z'
    println(r2.toList)

    var r3 = 1 until 10 // excludes last element
    println(r3.toList)

    var r4 = 'a' until 'z'  // excludes last element
    println(r4.toList)

    val r5 = 1 to 100 by 2
    println(r5.toList)

    val r6 = Range(1, 10) // uses until
    println(r6.toList)

    val r7 = Range.inclusive(1, 10)
    println(r7.toList)

    val r8 = Range(1, 10, 3) // step 3
    println(r8.toList)

    val r10 = 10 to 1 by -1
    println(r10.toList)

    val r11 = (1 to 10).reverse
    println(r11.toList)
}