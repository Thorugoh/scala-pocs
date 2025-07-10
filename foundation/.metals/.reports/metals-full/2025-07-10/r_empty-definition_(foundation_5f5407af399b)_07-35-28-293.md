error id: file://<WORKSPACE>/CommonHigherOrderFunctions.scala:scala/collection/IterableOnceOps#maxBy().
file://<WORKSPACE>/CommonHigherOrderFunctions.scala
empty definition using pc, found symbol in pc: scala/collection/IterableOnceOps#maxBy().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -clients/maxBy.
	 -clients/maxBy#
	 -clients/maxBy().
	 -scala/Predef.clients.maxBy.
	 -scala/Predef.clients.maxBy#
	 -scala/Predef.clients.maxBy().
offset: 491
uri: file://<WORKSPACE>/CommonHigherOrderFunctions.scala
text:
```scala
@main
def commonHigherOrderFunctions(): Unit = {
    val clients = List("Carol", "David", "Anna", "Bob")
    // Foreach
    clients.foreach { client =>
        println(s"Hello $client")
    }

    // filter
    // clients.filter(_.length <= 4).foreach(println)
    println(clients.filter(_.length <= 4))

    // map
    val sizes = clients.map(_.length)
    println(sizes)

    // sortBy
    val sorted = clients.sortBy(_.length)
    println(sorted)

    // maxBy
    val maxBy = clients.max@@By(_.length)

    // minBy
    val minBy = clients.minBy(_.length)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/collection/IterableOnceOps#maxBy().