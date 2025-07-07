error id: file://<WORKSPACE>/FunctionParameters.scala:`<none>`.
file://<WORKSPACE>/FunctionParameters.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 200
uri: file://<WORKSPACE>/FunctionParameters.scala
text:
```scala
@main
def functionParameters(): Unit = {
    double()
    for(i <- 1 to 10)
        double(i)
    
    val clients = List("Anna", "John", "Michelle")
    sayHello(clients)

    doubleMessage("Doubled @@value")
}

def double (number: Int = 3) = {
    println(s"Double of $number is ${number * 2}")
}

def sayHello(people: List[String]): Unit = {
    for(person <- people)
        println(s"Hi $person")
}

def doubleMessage(number: Int, message: String = "Double is"): Unit = {
    println(s"$message ${number * 2}")
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.