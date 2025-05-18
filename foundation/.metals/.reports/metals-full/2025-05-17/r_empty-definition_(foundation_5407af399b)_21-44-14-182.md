error id: file://<WORKSPACE>/generics.scala:`<none>`.
file://<WORKSPACE>/generics.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -elements/tail.
	 -elements/tail#
	 -elements/tail().
	 -scala/Predef.elements.tail.
	 -scala/Predef.elements.tail#
	 -scala/Predef.elements.tail().
offset: 326
uri: file://<WORKSPACE>/generics.scala
text:
```scala
// Declare the generic type as parameter A
//          v
class Stack[A]:
    private var elements: List[A] = Nil

    def push(x: A): Unit = 
        elements = elements.prepended(x)

    
    def peek: A = elements.head
    def pop(): A =
        val currentTop = peek
        println(elements)
        elements = elements.ta@@il
        currentTop

@main
def generics(): Unit =
    val stack = Stack[Int]

    stack.push(1)
    stack.push(2)
    println(stack.pop())
    println(stack.pop())
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.