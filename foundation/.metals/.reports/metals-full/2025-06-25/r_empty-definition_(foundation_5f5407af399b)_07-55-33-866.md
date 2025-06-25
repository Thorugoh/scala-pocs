error id: file://<WORKSPACE>/hashSetFunctions.scala:scala/Int#
file://<WORKSPACE>/hashSetFunctions.scala
empty definition using pc, found symbol in pc: scala/Int#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Int#
	 -scala/Predef.Int#
offset: 334
uri: file://<WORKSPACE>/hashSetFunctions.scala
text:
```scala
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
    val n2 = HashSet[In@@t](4, 5, 6, 7, 8)
    println(numbers.intersect(n2))
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Int#