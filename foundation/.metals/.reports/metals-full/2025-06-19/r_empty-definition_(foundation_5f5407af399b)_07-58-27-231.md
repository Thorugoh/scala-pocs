error id: file://<WORKSPACE>/Exceptions.scala:`<none>`.
file://<WORKSPACE>/Exceptions.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 228
uri: file://<WORKSPACE>/Exceptions.scala
text:
```scala
import scala.io.StdIn

@main
def exceptions(): Unit = {
    val input = StdIn.readLine()
    
    try {
        val number = input.toInt
    } catch {
        case f: NumberFormatException => {
            println("Number format@@ exception ocurred")
        }
        case e: Exception => {
            println("Exeception ocurred")
            println(e.printStackTrace())
        }
    }

    println("Continuing execution")
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.