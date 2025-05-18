error id: file://<WORKSPACE>/controlStructures.scala:scala/Predef.print().
file://<WORKSPACE>/controlStructures.scala
empty definition using pc, found symbol in pc: scala/Predef.print().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -print.
	 -print#
	 -print().
	 -scala/Predef.print.
	 -scala/Predef.print#
	 -scala/Predef.print().
offset: 350
uri: file://<WORKSPACE>/controlStructures.scala
text:
```scala
/*
    Scala has the control structures you find in other programming languages, and also has powerful for expressions and match expressions:
*/


def ifelse(x: Int): String =
    return if(x < 0) then "negative"
    else if x == 0 then "zero"
    else "positive"


def forLoop(): Unit =
    val ints = List(1,2,3,4,5)
    val x = for i <- ints do pr@@int(i + " ")


@main def controlStructures(): Unit =
    // println(ifelse(-1))
    forLoop()
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Predef.print().