@main
def functionOverloading(): Unit = {
    println(multiply(7))
    println(multiply(7, 3))

    sayHello("John")
    sayHello(List("Anna", "Bob", "Carol"))
}

// two functions can have the same name
 // if they have different numbers or types of paremeters

 def multiply(number: Int) = number * 2
 def multiply(number: Int, multiplier: Int) = number * multiplier

 def sayHello(person: String) = println(s"Hi $person")
 def sayHello(people: Iterable[String]): Unit =
    for(person <- people)
        println(person)