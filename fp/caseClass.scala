// define a case class
case class Person(
    name: String,
    vocation: String,
)

// create an instance of the case class
val p = Person("Reginald Keneeth Dwight", "Singer")

@main def caseClass(): Unit =
    // a good default toString method
    println(p) // : Person = Person(Reginald Keneeth Dwight,Singer)
    
    // can access its fields, which are immutable
    println(p.name)
    // p.name = "Victor" error: can't reassign a val field

    val p2 = p.copy(name = "Elton John")
    println(p2)
