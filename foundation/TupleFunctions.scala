@main
def tupleFunctions(): Unit = {
    val conn = (80, "www", "google", true)
    
    println(conn.toString())
    val conn2 = conn.copy(_2 = "ftp") // create new tuple changing position 2
    println(conn2)

    println(conn.productArity) // Tuple size

    val conn3 = ("abc", 123)
    println(conn3.swap) // only works with Tuple2 create new tuple inverting the values order

    val info = ("auth", "cache")
    println((conn ++ info)) // create new tuple concating both tuples

}