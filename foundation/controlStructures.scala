/*
    Scala has the control structures you find in other programming languages, and also has powerful for expressions and match expressions:
*/


def ifelse(x: Int): String =
    return if(x < 0) then "negative"
    else if x == 0 then "zero"
    else "positive"


def forLoop(): Unit =
    val ints = List(1,2,3,4,5)
    for i <- ints do print(i + " ")
    println("")

    //Guard
    for i <- ints if i > 2 
    do print(i + " ")
    println("")

    // Multiple Generators and Guard

    for 
        i <- 1 to 3
        j <- 'a' to 'c'
        if j == 'b'
        if i == 2
    do 
        println(s"i = $i, j = $j")

    // Gives sam result as :
    for i <- 1 to 3 do
        for j <- 'a' to 'c' do
            if j == 'b' && i == 2 then
            println(s"i = $i, j = $j")
    

    // yelds (for expression)
    // val doubles = for i <- ints yield i * 2
    // val doubles = for (i <- ints) yield i * 2
    val doubles = for { i <- ints } yield (i * 2)
    println(doubles)
        
    
    val names = List("chirs", "ed", "maurice")
    val capNames = for name <- names yield name.capitalize
    println(capNames)
    

    val fruits = List("apple", "banana", "lime", "orange")
    // This will act like a filter / map where only fruits with length > 4 will go to the List
    val fruitsLength = for
        f <- fruits
        if f.length() > 4
    yield 
        f.length()
    
    println(fruitsLength)

case class Person(name: String, age: Int)

def matchExpression(i: Int): Unit =

    // It can be very basic acting like a switch case in Java
    i match 
        case 1 => println("one")
        case 2 => println("two")
        case 3 => println("three")
        case _ => println("other")

    // It's an expression you can bind return to a variable
    val result = i match
        case 1 => "one"
        case 2 => "two"
        case 3 => "three"
        case _ => "other"
    
    // It can be used with any data type
    val p = Person("Fred", 10)
    p match 
        case Person(name, _) if name == "Fred" => 
            println(s"$name says, Yubba dubba doo")
        case Person(name, _) if name == "Bam Bam" => 
            println(s"$name says, Bam bam!")
        case _ => println("Wathc the Flintstiones!")

// this will check for the type of x, labels on case can be really anything, even the same, what matters
// the most is the :Type
def getClassAsString(x: Matchable): String = x match
    case s: String => s"'$s' is a String"
    case i: Int => "Int"
    case d: Double => "Double"
    case l: List[?] => "List"
    case _ => "unknown"

@main def controlStructures(): Unit =
    // println(ifelse(-1))
    // forLoop()
    // matchExpression(1)
    println(getClassAsString(1))               // Int
    println(getClassAsString("hello"))       // 'hello' is a String
    println(getClassAsString(List(1, 2, 3)))   // List