@main
def tuples(): Unit = {
    val conn = (80, "www", "google.com", true) // Tuple4
    val conn2 = Tuple4(80, "www", "google.com", true)
    println(conn)
    println(conn2)

    val tup = Tuple2[Int, String](123, "abc")
    println(tup)

    println(conn(1)) // get element at index
    println(conn._1) // get by position

}