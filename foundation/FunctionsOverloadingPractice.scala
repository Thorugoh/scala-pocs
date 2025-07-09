@main
def functionsOverloadingPractice(): Unit = {
    feedAnimal("Cat")
    feedAnimal(List("Cat", "Dog", "Parrot"))

    printLength("Hello how are you")
    printLength(9)

}

def feedAnimal(animal: String): Unit =
    println(s"Feeding the $animal")

def feedAnimal(animals: Iterable[String]): Unit =
    for(animal <- animals)
        feedAnimal(animal)

def printLength(message: String): Unit =
    println(s"$message has a size of ${message.length}")

def printLength(length: Int): Unit =
    var message = ""
    for(i <- 1 to length)
        message += "a"
    println(s"A message of $length is $message")