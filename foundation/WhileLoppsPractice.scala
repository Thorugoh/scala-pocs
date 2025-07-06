import scala.io.StdIn
import scala.collection.mutable.ArrayBuffer
@main
def whileLoopsPractice(): Unit = {
    var i = 0
    while(i < 10)
        i+=1
        println(s"#$i: Hello how are you?")

    
    val cats = List("Tiger", "Smokey", "Sassy", "Patch", "Sammy")
    var j = 0
    while(j < cats.length)
      println(s"Hello ${cats(j)}")
      j+=1

    val number = 20
    var k = 1
    var result = 1l
    while(k <= number)
        result *= k
        k+=1
    
    println(s"$number! = $result")

    val usernames = ArrayBuffer("john", "bob", "alice")
    var continue = true
    
    while (continue)
        println("Please enter your desired username")
        val uName = StdIn.readLine()
        if(!usernames.contains(uName))
            usernames.addOne(uName)
            continue = false
        else
            println("Your username is already taken. Choose another.")
    println(usernames)
}