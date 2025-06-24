@main
def arrays(): Unit = {
    // a mutable changable ordered collection
    Array(1, 2, 3, 4, 5)

    // any data type (but can be restricted)
    val a = Array(1, 2, true)
    // val b = Array[String]("one", "tow", 3) // Error

    // printing
    a.foreach(println)
    println(a.mkString)
    println(a.toList)

    // size cannot be changed
    a(1) = 4 // Ok
    println(a.toList)
    // create new array based on another
    val c = 0 +: a :+ 4 // +: adds to beggining :+ adds to end
    println(c.toList)
    println((a ++ c).toList) // concat arrays into a new one
}