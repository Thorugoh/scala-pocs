error id: file://<WORKSPACE>/WhileLoopsNested.scala:`<none>`.
file://<WORKSPACE>/WhileLoopsNested.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 106
uri: file://<WORKSPACE>/WhileLoopsNested.scala
text:
```scala
@main
def whileLoopsNested(): Unit = {
    var i = 0
    var j = 0
    while(i <= 10)
        while(j <= 1@@0)
            print(s"$i, $j\t")
            j += 1
        println()
        i += 1
        j = 0
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.