error id: file://<WORKSPACE>/ForLoopsFilter.scala:`<none>`.
file://<WORKSPACE>/ForLoopsFilter.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 107
uri: file://<WORKSPACE>/ForLoopsFilter.scala
text:
```scala
@main
def forLoopFilters(): Unit = {
    val clients = List("Alice", "Bob", "Carol", "Britney", "Tom")
    @@for(client <- clients if client.length > 4)
        println(s"Hello $client")

    
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.