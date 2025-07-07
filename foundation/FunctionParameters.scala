@main
def functionParameters(): Unit = {
    double()
    for(i <- 1 to 10)
        double(i)
    
    val clients = List("Anna", "John", "Michelle")
    sayHello(clients)

    doubleMessage(message = "Doubled value", number = 3)
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