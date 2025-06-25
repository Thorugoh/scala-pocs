@main
def setFunctions(): Unit = {
    val items = Set(3, 4, true, "Hi")
    println(items.size)

    println(items.contains("Hi"))
    
    println(items.isEmpty)
    println(items.nonEmpty)

    println(items.head)
    println(items.tail)
}