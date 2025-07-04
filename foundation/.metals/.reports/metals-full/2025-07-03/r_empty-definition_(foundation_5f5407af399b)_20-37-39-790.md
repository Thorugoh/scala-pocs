error id: file://<WORKSPACE>/ArrayBuffer.scala:`<none>`.
file://<WORKSPACE>/ArrayBuffer.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 340
uri: file://<WORKSPACE>/ArrayBuffer.scala
text:
```scala
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
    a.remove(1, 3) // remove in r@@ange 1 to 3

    // remove all ements from collection
    a --= List(4, 7, 8)
    println(a)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.