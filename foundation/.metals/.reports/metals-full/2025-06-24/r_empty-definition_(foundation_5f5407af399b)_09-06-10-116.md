error id: file://<WORKSPACE>/Arrays.scala:`<none>`.
file://<WORKSPACE>/Arrays.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 339
uri: file://<WORKSPACE>/Arrays.scala
text:
```scala
@main
def arrays(): Unit = {
    // a mutable changable ordered collection
    Array(1, 2, 3, 4, 5)

    // any data type (but can be restricted)
    val a = Array(1, 2, true)
    // val b = Array[String]("one", "tow", 3) // Error

    // printing
    a.foreach(println)
    println(a.mkString)
    println(a.toList)

    // size cannot be@@ changed
    a(1) = 4
    println(a.toList)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.