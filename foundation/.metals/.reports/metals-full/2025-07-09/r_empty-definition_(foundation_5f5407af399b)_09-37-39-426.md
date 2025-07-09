error id: file://<WORKSPACE>/Random.scala:scala/util/Random#nextPrintableChar().
file://<WORKSPACE>/Random.scala
empty definition using pc, found symbol in pc: scala/util/Random#nextPrintableChar().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -scala/util/Random.nextPrintableChar.
	 -scala/util/Random.nextPrintableChar#
	 -scala/util/Random.nextPrintableChar().
	 -Random.nextPrintableChar.
	 -Random.nextPrintableChar#
	 -Random.nextPrintableChar().
	 -scala/Predef.Random.nextPrintableChar.
	 -scala/Predef.Random.nextPrintableChar#
	 -scala/Predef.Random.nextPrintableChar().
offset: 181
uri: file://<WORKSPACE>/Random.scala
text:
```scala
import scala.util.Random

@main
def generateRandom(): Unit = {
    println(Random.nextInt())
    println(Random.nextInt(100))
    println(Random.nextString(20))
    println(Random.n@@extPrintableChar())

    println(Iterator.continually(Random.nextPrintableChar()).take(20).mkString)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/util/Random#nextPrintableChar().