error id: file://<WORKSPACE>/RangeFunctions.scala:`<none>`.
file://<WORKSPACE>/RangeFunctions.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 340
uri: file://<WORKSPACE>/RangeFunctions.scala
text:
```scala
import scala.io.StdIn
@main
def rangeFunctions(): Unit = {
    val r = 1 to 10 by 2
    println("Guess a number in the range")

    val nb = StdIn.readLine().toInt
    if(r.contains(nb))
        println("Good guess")
    else 
        println("wrong")

    
    println(s"Step: ${r.step}")
    println(s"Head: ${r.head}")
    println(s"Tail@@: ${r.tail}")
    println(s"Last: ${r.last}")
    println(s"End: ${r.end}")
    println(s"Index of 3: ${r.indexOf(3)}")
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.