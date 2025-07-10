error id: file://<WORKSPACE>/LambdasPractice.scala:scala/Array#
file://<WORKSPACE>/LambdasPractice.scala
empty definition using pc, found symbol in pc: scala/Array#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Array#
	 -scala/Predef.Array#
offset: 62
uri: file://<WORKSPACE>/LambdasPractice.scala
text:
```scala
@main
def lambdaPractice(): Unit = {

}

def update(numbers: A@@rray[Double], lbd: Double => Double): Array[Double] =
    for(i <- numbers.indices)
        if(numbers(i) % 2 == 0)
            numbers(i) = lbd(numbers(i))
    numbers
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Array#