error id: file://<WORKSPACE>/PatternMatchingPractice.scala:scala/io/StdIn.
file://<WORKSPACE>/PatternMatchingPractice.scala
empty definition using pc, found symbol in pc: scala/io/StdIn.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -scala/io/StdIn.
	 -StdIn.
	 -scala/Predef.StdIn.
offset: 139
uri: file://<WORKSPACE>/PatternMatchingPractice.scala
text:
```scala
import scala.io.StdIn
@main
def patternMatchingPractice(): Unit = {
    println("How many meals do you have per day?")
    val meals = StdI@@n.readInt()

    meals match
        case x if 0 to 2 contains meals => println("You should eat more")
        case 3 => println("That's perfect")
        case _ => println("You should eat less")
    
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/io/StdIn.