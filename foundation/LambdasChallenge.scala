import scala.collection.mutable.ArrayBuffer
@main
def lambdasChallenge(): Unit = {
    val clients = List("Michael", "Jane", "Mary", "Dan")
    val messages = getMessages(clients, (name: String) => s"Hello $name how are you")
    for(i <- messages.indices)
        println(s"Message for ${clients(i)}")
        println(messages(i))
        println()
}

def getMessages(clients: List[String], getMessage: String => String): List[String] =
    val messages = ArrayBuffer[String]()
    for(client <- clients)
        messages.addOne(getMessage(client))
    messages.toList