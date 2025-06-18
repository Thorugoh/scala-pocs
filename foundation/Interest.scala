import scala.io.StdIn
@main
def calcInterest(): Unit = {
    val interest = 5.5f
    val years = 5
    println("Enter amount you have on bank")
    val amount = StdIn.readFloat()
    println(s"Interest: 5.5%")
    var total = amount
    for(n <- 0 to years) {
        total = total + (total * (interest / 100))
    }
    println(s"5 years projection: ${total}")
}