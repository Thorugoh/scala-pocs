error id: file://<WORKSPACE>/Interest.scala:scala/Float#
file://<WORKSPACE>/Interest.scala
empty definition using pc, found symbol in pc: scala/Float#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Float#
	 -scala/Predef.Float#
offset: 231
uri: file://<WORKSPACE>/Interest.scala
text:
```scala
import scala.io.StdIn
@main
def calcInterest(): Unit = {
    val interest = 5.5d
    val years = 5
    println("Enter amount you have on bank")
    val amount = StdIn.readDouble()
    println(s"Interest: 5.5%")
    var total: Float@@ = amount
    for(n <- 0 to years) {
        total += total * (interest / 100)
    }
    println(s"5 years projection: ${total}")
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Float#