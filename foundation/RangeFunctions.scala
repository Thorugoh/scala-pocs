import scala.io.StdIn
@main
def rangeFunctions(): Unit = {
    val r = 1 to 10 by 2
    println("Guess a number in the range")

    val nb = StdIn.readLine().toInt
    if(r.contains(nb))
        println("Good guess")
    else 
        println("wrong")

    
    println(s"Step: ${r.step}")
    println(s"Head: ${r.head}")
    println(s"Tail: ${r.tail}")
    println(s"Last: ${r.last}")
    println(s"End: ${r.end}")
    println(s"Index of 3: ${r.indexOf(3)}")
    println(s"Index of 4: ${r.indexOf(4)}")
    println(s"Length: ${r.length}")
}