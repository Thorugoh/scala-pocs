@main
def functionScope(): Unit = {
    // println(s"I have $flowers flowers") // flower is out of scope
    example()

}

def example(): Unit =
    val flowers = 5
    test()
    def test(): Unit = {
        println(s"U have $flowers flowers")
    }