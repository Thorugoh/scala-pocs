import scala.io.StdIn
@main
def ifStatement(): Unit = {
    // println("Input a boolean value, Is it night time? (true/false)")
    // val night = StdIn.readBoolean()

    // if(night)
    //     println("Sleep, it's night")
    // else
    //     println("Be active, it's day time")

    println("Please input the funds amount")
    var clientFunds = StdIn.readInt()
    val price = 50
    var clientProducts = 0

    if(clientFunds >= price)
        clientFunds -= price
        clientProducts += 1
        println(s"You have purchased $clientProducts products")
        println(s"You have $$$clientFunds")
    else
        println("You have insufficient funds")
}