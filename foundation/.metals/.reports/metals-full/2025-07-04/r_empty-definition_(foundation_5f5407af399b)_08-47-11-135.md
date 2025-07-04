error id: file://<WORKSPACE>/ForLoopsPractice.scala:`<none>`.
file://<WORKSPACE>/ForLoopsPractice.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 596
uri: file://<WORKSPACE>/ForLoopsPractice.scala
text:
```scala
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
    val monts = Map[Int, Int](
        (1 | 2 | 7 | 8 | 10 | 12) -> 31, 
        2 -> (if(isLeapYear) 29 els@@e 30),
        3 -> 31,
        4 -> 30,
        5 -> 31,
        6 -> 30,
        7 -> 31,
        8 -> 31,
        9 -> 30,
        10 -> 31,
        11 -> 30
        12 -> 31


    )
    for()
        
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.