error id: file://<WORKSPACE>/controlStructures.scala:scala/Predef.String#
file://<WORKSPACE>/controlStructures.scala
empty definition using pc, found symbol in pc: scala/Predef.String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -String#
	 -scala/Predef.String#
offset: 1452
uri: file://<WORKSPACE>/controlStructures.scala
text:
```scala
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

case class Person(name: Str@@ing)

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
    val p = Person("Fred")
    p match 
        case Person(name) if name == "Fred" => 
            println(s"$name says, Yubba dubba doo")
    

@main def controlStructures(): Unit =
    // println(ifelse(-1))
    // forLoop()
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Predef.String#