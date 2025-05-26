error id: file://<WORKSPACE>/Variables.scala:`<none>`.
file://<WORKSPACE>/Variables.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 157
uri: file://<WORKSPACE>/Variables.scala
text:
```scala
@main
def variables(): Unit = {
    var tvShows = "many"
    println(tvShows)
    tvShows = "too many"
    println(tvShows)

    // tvshows = 5 can't change @@type
    val color1 = "blue"
    color1 = "red" 
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.