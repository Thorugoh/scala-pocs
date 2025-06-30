import scala.collection.mutable.ArrayBuffer
@main
def booleanFunctions(): Unit = {
    val animals = ArrayBuffer[String]("cat")
    if(animals.isEmpty)
        animals.addOne("dog")
    
    println(animals)

    val animals1 = List("dog", "cat", "bird")
    if(animals1.startsWith(List("dog")))
     println("I love dogs")

    val pet = "My cat's name is Whiskers and she's mischievous"
    if(pet.startsWith("My cat"))
        println("Hello kitty")
}