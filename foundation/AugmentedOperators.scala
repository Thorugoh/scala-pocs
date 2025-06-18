@main
def augmentedOperators(): Unit = {
    var bikes = 5
    bikes += 1 // bikes = bikes + 1 (shorthanded)
    println(bikes)

    bikes -= 1 // bikes = bikes - 1
    println(bikes)

    bikes *= 2
    println(bikes)

    bikes /= 3
    println(bikes)

    bikes %= 2
    println(bikes)
}