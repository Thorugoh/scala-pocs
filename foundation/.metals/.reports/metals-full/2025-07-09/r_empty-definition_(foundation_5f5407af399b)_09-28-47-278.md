error id: file://<WORKSPACE>/FunctionsOverloadingPractice.scala:`<none>`.
file://<WORKSPACE>/FunctionsOverloadingPractice.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -println.
	 -println#
	 -println().
	 -scala/Predef.println.
	 -scala/Predef.println#
	 -scala/Predef.println().
offset: 191
uri: file://<WORKSPACE>/FunctionsOverloadingPractice.scala
text:
```scala
@main
def functionsOverloadingPractice(): Unit = {
    feedAnimal("Cat")
    feedAnimal(List("Cat", "Dog", "Parrot"))

    printLength()

}

def feedAnimal(animal: String): Unit =
    println@@(s"Feeding the $animal")

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
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.