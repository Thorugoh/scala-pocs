@main
def maps(): Unit = {
    // Map is a set of key-value pairs
    // keys are unique, values can be duplicates
    val count = Map(1 -> "one", 2 -> "two", 3 -> "three")
    val count2 = Map((1, "one"), (2, "two"))

    // can specify the type
    // val count3: Map[Int, String] = Map(1 -> "one", 2 -> true) // Error

    val count4 = Map()

    println(count)
    println(count2)
    println(count4)

    // Provides key in parentheses (not index)
    println(count(2)) // two

    println(count.keySet)
    println(count.values)

}