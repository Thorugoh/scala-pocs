@main
def forLoopsPractice(): Unit = {
    for(x <- 1 to 10) {
        println(s"#$x: Hello how are you")
    }

    var total = 0
    for(x <- 1 to 100){
        total += x
    }
    println(s"Total is $total")

    val customers = Map("Alice" -> 4, "Judy" -> 8, "Anna" -> 6)
    for(customerName <- customers.keys)
        val purchases = customers(customerName)
        println(s" $customerName you purchase $purchases items")


    val year = 2025;
    val isLeapYear = year % 4 == 0

    val months = List(
        1 -> 31,
        2 -> (if(isLeapYear) 29 else 28),
        3 -> 31,
        4 -> 30,
        5 -> 31,
        6 -> 30,
        7 -> 31,
        8 -> 31,
        9 -> 30,
        10 -> 31,
        11 -> 30,
        12 -> 31
    )

    for(month <- months) {
        println(s"Month: ${month._1}, Days: ${month._2}")
    }
        
}