// Local function is a function insde another function
@main
def functionsLocal(): Unit = {
    listAnimals()
}

def listAnimals(): Unit = 
    def listOneAnimal(animal: String): Unit = 
        println(s"U have a $animal")

    val myAnimals = List("cat", "dog", "cow", "horse")
    for(animal <- myAnimals)
        listOneAnimal(animal)