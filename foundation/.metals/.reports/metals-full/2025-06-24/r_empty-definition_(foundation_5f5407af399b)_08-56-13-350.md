error id: file://<WORKSPACE>/AugmentedOperators.scala:`<none>`.
file://<WORKSPACE>/AugmentedOperators.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 160
uri: file://<WORKSPACE>/AugmentedOperators.scala
text:
```scala
@main
def augmentedOperators(): Unit = {
    var bikes = 5
    bikes += 1 // bikes = bikes + 1 (shorthanded)
    println(bikes)

    bikes -= 1 // bikes = bikes@@ - 1
    println(bikes)

    bikes *= 2
    println(bikes)

    bikes /= 3
    println(bikes)

    bikes %= 2
    println(bikes)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.