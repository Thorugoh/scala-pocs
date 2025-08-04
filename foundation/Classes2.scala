@main
def classesPractice2(): Unit =
    println("classes practice 2")
    var sm = SimpleMath()
    println(sm.add(1, 2))
    println(sm.sub(5, 3))
    println(sm.mul(5, 3))
    println(sm.div(10, 2))


class SimpleMath:
    def add(a: Int, b: Int): Int =
        a + b
    
    def sub(a: Int, b: Int): Int =
        a - b

    def mul(a: Int, b: Int): Int = 
        a * b

    def div(a: Int, b: Int): Int = 
        a / b