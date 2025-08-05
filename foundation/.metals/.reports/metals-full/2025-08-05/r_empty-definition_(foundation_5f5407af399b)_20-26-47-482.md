error id: file://<WORKSPACE>/Calculator.scala:scala/Double#
file://<WORKSPACE>/Calculator.scala
empty definition using pc, found symbol in pc: scala/Double#
semanticdb not found
empty definition using fallback
non-local guesses:
	 -Double#
	 -scala/Predef.Double#
offset: 144
uri: file://<WORKSPACE>/Calculator.scala
text:
```scala
@main 
def calculatorTest(): Unit =
    val calculator = Calculator()

class Calculator:
    var total: Double = 0

    def add(value: Double): @@Double = 
        total += value
        total

    def multiply(value: Double): Double =
        total *= value
        total

    def divide(value: Double): Double = 
        total /= value
        total
    
    def subtract(value: Double): Double = 
        total -= value
        total

```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Double#