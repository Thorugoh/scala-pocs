error id: file://<WORKSPACE>/MoreForLoops.scala:`<none>`.
file://<WORKSPACE>/MoreForLoops.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 163
uri: file://<WORKSPACE>/MoreForLoops.scala
text:
```scala
@main
def moreForLoops(): Unit = {
    for (row <- 1 to 5; column <- 3 to 9)
        println(s"x = $row, y=$column")

    for(row <- 1 to 5)
        for(column <- @@1 to 5)
            println(s"$row, $column")
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.