class Person(var firstName: String, var lastName: String):
    def printFullName() = println(s"$firstName $lastName")

@main def classes(): Unit =
    val p = Person("Victor", "Hugo")
    println(p.firstName)
    p.lastName = "Legend"
    p.printFullName()