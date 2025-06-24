import scala.collection.mutable.ArrayBuffer

@main
def arrayBuffer(): Unit = {
    val a = ArrayBuffer(1, 2, 3)
    println(a)

    a.addOne(4) // adds to the end
    println(a)
    a.addAll(List(7, 8, 9)) // add multiple elements
    println(a)

    // Removing elements
    a.remove(1) // remove by index
    a.remove(1, 3) // remove in range 1 to 3

    // remove all ements from collection
    a --= List(4, 7, 8)
    println(a)
}