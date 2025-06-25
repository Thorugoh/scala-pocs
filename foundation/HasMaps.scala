import scala.collection.mutable.HashMap

@main
def hashMaps(): Unit = {
    val count = HashMap((1, "one"), (2, "two"), (3, "three"))
    println(count)

    count += (4 -> "four")
    count.addOne((5, "five"))

    println(count)

    count ++= Map(10 -> "ten", 11 -> "eleven")
    count.addAll(Map(12 -> "twelve", 13 -> "thirteen"))
    println(count)

    count -= 4 // 4 is the key
    println(count)

    count --= Set(10, 12)
    println(count)

    count(11) = "ten plus one"
    println(count)

    count.clear()
    println(count)
}