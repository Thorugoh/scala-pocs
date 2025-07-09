
@main
def funcitonsRepeatedParameters(): Unit = {
    sayHello("Anna", "Bob")
    val users = List("Alice", "Bob", "Carol")
    // sayHello(users)
    // Splat operator
    sayHello(users*)
}

def sayHello(names: String*): Unit =
    for(name <- names)
        println(s"Hello $name")