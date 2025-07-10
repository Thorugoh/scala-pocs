error id: file://<WORKSPACE>/HigherOrderFunction.scala:`<none>`.
file://<WORKSPACE>/HigherOrderFunction.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 127
uri: file://<WORKSPACE>/HigherOrderFunction.scala
text:
```scala
// higher order function is a function
@main
def higherOrderFunctions(): Unit = {
    // val names = List("Mary", "Kate", "Mike@@")
    // val myLambda = (name: String) => println(s"Hello $name")
    // sayHello(names, myLambda)
    // OR

    sayHello(names, (name: String) => println(s"Hello $name"))
}

def sayHello(names: List[String], doSomething: String => Unit): Unit =
    for(name <- names)
        doSomething(name)
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.