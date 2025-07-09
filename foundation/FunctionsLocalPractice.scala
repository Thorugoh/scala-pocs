import scala.collection.mutable

@main
def functionsLocalPractice(): Unit = {
    awesomeBank(mutable.HashMap("Alice" -> 635, "Bob" -> 387, "Carol" -> 9623))
}

def awesomeBank(users: mutable.HashMap[String, Int]): Unit =
    def doubleAmount(amount: Int) = amount * 2

    for(user <- users.keys)
        users(user) = doubleAmount(users(user))
    
    println(users)