import scala.collection.mutable.HashSet
@main
def hashSetFunctins(): Any = {
    val numbers = HashSet(3, 4, 83, 56)
    println(numbers)

    numbers.addOne(22)
    numbers.addAll(List(5, 6, 83))
    println(numbers)
    numbers.remove(5)
    numbers.subtractOne(22)
    println(numbers)

    // Intersections
    val n2 = HashSet(4, 5, 6, 7, 8)
    println(numbers.intersect(n2))
    println(numbers.union(n2))
    println(numbers.diff(n2)) //numbers that are on first set but not on second one
}