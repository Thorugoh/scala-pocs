@main
def functionReturn(): Unit = {
    val r = 64
    val area = calculateCircleArea(r)
    println(s"A circle with the radius of $r has the area of $area")
    println(s"A circle with the radius of $r has the area of ${calculateCircleArea2(r)}")
    val clients = List("Anna", "Bob", "William")
    for(client <- clients)
        println(persionalisedGreeting(client))
}

def calculateCircleArea(radius: Int): Double = {
    val pi = 3.14159
    // return keyword can be omitted on last line
    pi * radius * radius
}

def persionalisedGreeting(person: String): String = {
    person(0) match
        case 'A' => s"Are you ok $person"
        case 'W' => s"What's up $person"
        case _ => s"Hi $person"
}

//Return shorthand
def calculateCircleArea2(radius: Int) = 3.14159 * radius * radius