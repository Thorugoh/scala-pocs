import scala.util.Random
@main
def commonHigherOrderFunctionsPractice(): Unit = {
    val numbers = (1 to 20).map(_ => Random.nextInt(200))

    println(numbers)
    println(numbers.filter(_.toString.length == 2))
    println(numbers.filter(nb => 9 < nb && nb < 100))
    println(numbers.filter(10 until 100 contains _))


    val clients = List("Tom", "Laura", "Dennis", "Mark")
    println(clients.sortBy(client => client(client.length - 1)))
    clients.sortBy(client => client(client.length - 1)).map(println)

    val ints = (1 to 6).map(_ => Random.nextInt(999)).filter(_ > 99)
    println(ints)
    println(ints.maxBy(_.toString()(1)))
    println(ints.maxBy(_ / 10 % 10))

}