import scala.collection.mutable.HashSet
import os.remove
@main
def setsPractice(): Unit = {
    val colors = HashSet("red", "green", "blue")
    println(colors)

    colors.addAll(List("pink", "black"))
    println(colors)

    colors.remove("green")
    println(colors)

    val objects = HashSet("laptop", "mouse", "pen", "paper", "coffee")
    val removeItems = Set("coffee", "paper", "pen")

    objects --= removeItems
    println(objects)
}