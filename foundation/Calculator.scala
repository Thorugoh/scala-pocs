@main 
def calculatorTest(): Unit =
    val calculator = Calculator()
    calculator.add(5).multiply(3).divide(5)

    calculator.showResult()

class Calculator:
    var total: Double = 0

    def add(value: Double): Calculator = 
        total += value
        this

    def multiply(value: Double): Calculator =
        total *= value
        this

    def divide(value: Double): Calculator = 
        total /= value
        this
    
    def subtract(value: Double): Calculator = 
        total -= value
        this

    def showResult(): Unit =
        println(s"Result: $total")
