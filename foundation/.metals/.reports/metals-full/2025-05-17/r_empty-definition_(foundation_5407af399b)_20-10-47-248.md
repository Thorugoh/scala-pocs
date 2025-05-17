error id: file://<WORKSPACE>/raw-interpolator.scala:`<none>`.
file://<WORKSPACE>/raw-interpolator.scala
empty definition using pc, found symbol in pc: `<none>`.
semanticdb not found
empty definition using fallback
non-local guesses:

offset: 36
uri: file://<WORKSPACE>/raw-interpolator.scala
text:
```scala

@main
def raw(): Unit =
    // simi@@lar to s interpolator but it does not perform scape
    // it's useful when we want to avoid expression like \n to turn into a return character.
    println(raw"a\nb") // a\nb

    val foo = 42
    println(raw"\n$foo")

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.