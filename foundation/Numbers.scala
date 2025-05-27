
@main
def numbers: Unit = {
    // val price = 34
    // val items = 3
    // val totalPrice = price * items

    // println(totalPrice)

    val items = 5
    println(items.getClass())

    val account = 2_000_000
    println(account.getClass())

    val nbOfPeople = 8_000_000_000l
    println(nbOfPeople.getClass())

    val price = 29.99f
    println(price.getClass())

    val pi = 3.14159
    println(pi.getClass())
}