@main
def mapFunctions(): Unit = {
    val count = Map(1 -> "one", 2 -> "two", 3 -> "three")
    
    println(count.size)
    println(count.contains(3))
    println(count.head)
    println(count.tail)
    println(count.isEmpty)
    println(Map().isEmpty)
    println(count(2))
}