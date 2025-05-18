@main def whileStructure(): Unit =
    var x = 10
    while x > 0 do x -= 1
    println(x)

    var y = 1
    while 
        x < 3
    do 
        println(x)
        x += 1