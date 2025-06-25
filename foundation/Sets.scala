import scala.collection.mutable.HashSet
@main
def sets(): Unit = {
    // Stores unique elements in an undefined order
    val numbers = Set(6, 34, 6, 42)
    println(numbers) // Set(6, 34, 42)

    // val values = Set[Int](1, 2, true) // Error true ins not an Int

    // Sets are immutable
    // numbers(1) = 28 -> Error
    // numbers.remove(true) -> Error

    // mutable sets
    val values = HashSet(3, 4, true, "hi")
    val noValues = HashSet[Int]()

    println(values)
    // We can add and remove values from a hashset
    values.add(86)
    println(values)
    values.remove(true)
    println(values)
    values += 9
    values -= 3
    println(values)

    values.addAll(List(1, 2, 3, 4, 5, 2))
    println(values)

    values += (10, 11)
    values -= (4, 5)
    println(values)

    val colors = HashSet("red", "green", "blue")
    values ++= Set("pink", "orange")
    println(colors)
    colors --= Set("red", "blue")
    println(colors)
}