@main
def lists(): Unit = {
    val l = List(1, 2, 3, 2, 5)
    println(l)

    // can contain various data types
    val m = List(1, true, "hello")
    println(m)

    // a list can be empty
    val n = List()
    val o = Nil
    println(n)
    println(o)

    // We can limit data types
    val p = List(1, 2, true)
    // val q = List[Int](1, 2, true) 

    val matrix = List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1),
    )

    println(matrix)
    println(matrix(0)(1))

    // Get an element from the list
    println(l(2))
    val colors = List("red", "green", "blue")
    println(colors.head)
    println(colors.tail)
    println(colors.tail.head)

    // get list length
    println(colors.length)
}