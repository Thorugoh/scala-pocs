@main
def commonHigherOrderFunctions(): Unit = {
    val clients = List("Carol", "David", "Anna", "Bob")
    // Foreach
    clients.foreach { client =>
        println(s"Hello $client")
    }

    // filter
    // clients.filter(_.length <= 4).foreach(println)
    println(clients.filter(_.length <= 4))

    // map
    val sizes = clients.map(_.length)
    println(sizes)

    // sortBy
    val sorted = clients.sortBy(_.length)
    println(sorted)

    // maxBy
    val maxBy = clients.maxBy(_.length)
    println(maxBy)

    // minBy
    val minBy = clients.minBy(_.length)
    println(minBy)
}