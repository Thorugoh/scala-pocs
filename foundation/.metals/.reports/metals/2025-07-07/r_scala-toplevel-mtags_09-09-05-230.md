error id: file://<WORKSPACE>/FunctionParameters.scala:[372..372) in Input.VirtualFile("file://<WORKSPACE>/FunctionParameters.scala", "@main
def functionParameters(): Unit = {
    double(5)
    for(i <- 1 to 10)
        double(i)
    
    val clients = List("Anna", "John", "Michelle")
    sayHello(clients)
}

def double (number: Int = 3) = {
    println(s"Double of $number is ${number * 2}")
}

def sayHello(people: List[String]): Unit = {
    for(person <- people)
        println(s"Hi $person")
}

def ")
file://<WORKSPACE>/file:<WORKSPACE>/FunctionParameters.scala
file://<WORKSPACE>/FunctionParameters.scala:20: error: expected identifier; obtained eof
def 
    ^
#### Short summary: 

expected identifier; obtained eof