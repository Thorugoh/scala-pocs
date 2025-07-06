error id: file://<WORKSPACE>/WhileLoppsPractice.scala:scala/io/StdIn.
file://<WORKSPACE>/WhileLoppsPractice.scala
empty definition using pc, found symbol in pc: scala/io/StdIn.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -StdIn.
	 -StdIn#
	 -StdIn().
	 -scala/Predef.StdIn.
	 -scala/Predef.StdIn#
	 -scala/Predef.StdIn().
offset: 646
uri: file://<WORKSPACE>/WhileLoppsPractice.scala
text:
```scala
import scala.io.StdIn
@main
def whileLoopsPractice(): Unit = {
    var i = 0
    while(i < 10)
        i+=1
        println(s"#$i: Hello how are you?")

    
    val cats = List("Tiger", "Smokey", "Sassy", "Patch", "Sammy")
    var j = 0
    while(j < cats.length)
      println(s"Hello ${cats(j)}")
      j+=1

    val number = 20
    var k = 1
    var result = 1l
    while(k <= number)
        result *= k
        k+=1
    
    println(s"$number! = $result")

    val usernames = ArrayBuffer("john", "bob", "alice")
    var continue = true
    
    while (continue)
        println("Please enter your desired username")
        val uName = Std@@In.readLine()
        if(!usernames.contains(uName))
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/io/StdIn.