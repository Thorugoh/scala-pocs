@main
def collections(): Unit = {
    // List is a oredred collectiong of elements
    // can be accessed by the position (index), can contain duplicate elements
    val a = List(1, 2, 3, 632, 9, 52, 6)
    val b = List(1, "hello", true)
    val c = List()

    // Set
    // group of unique elements
    // the order has no significance
    // we can iterate through it but ther order is not defined
    Set(1, 2, 3, 632, 9, 52, 6)
    // a deck of card is a set

    //Map
    // a set of key-value pairs
    // Keys are unique (set)
    // Each key maos exactly to one value
    // values can be duplicates
    Map("UK" -> "London", "Japan" -> "Tokyo", "Brazil" -> "Brasilia")

    // a dictionary is a map
        //mas words to definitions
    
    // Tuple
    // a fixed size group of various data types
    // Can contain duplicates
    // Immutable
    // The type of tuple depends on the number of elements

    val a1 = (1, "Hello", false)
    val b1 =  Tuple1("one element")
    val c1 = Tuple2(2, "two elements")
    val d1 = Tuple3(4, "three", true)


}