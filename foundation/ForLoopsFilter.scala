@main
def forLoopFilters(): Unit = {
    val clients = List("Alice", "Bob", "Carol", "Britney", "Tom")
    for(client <- clients if client.length > 4)
        println(s"Hello $client")

    println("---")
    // multiple filters
    for(client <- clients if client.length > 4; if client.toLowerCase.contains("a"))
        println(s"Hello $client")

    println("---")

    val output = for(client <- clients if client.length > 4)
        yield client
    
    println(output)

    for(i <- 1 to 10; j <- 1 to i) {
        print("\uD83D\uDE00")
        if (j == i) println()
    }

}