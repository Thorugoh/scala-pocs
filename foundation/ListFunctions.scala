@main
def listFunctions(): Unit = {
    val colors = List("blue", "red", "blue", "green")

    println(colors.isEmpty)
    println(colors.length)

    println(colors.contains("red"))
    println(colors.contains("pink"))

    println(colors.indexOf("red"))
    println(colors.indexOf("blue"))
    println(colors.lastIndexOf("blue"))
}