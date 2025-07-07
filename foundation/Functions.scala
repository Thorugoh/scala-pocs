@main
// def short for define - function name - parameters - output type - equals sign block of code
def functions(): Unit = {
    for (i <- 1 to 10) {
        sayHello()
    }

    var i = 5
    while(i > 0) {
        printAlphabet()
        i -= 1
    }
}

def sayHello(): Unit = {
    println("Hello everyone")
}

def printAlphabet(): Unit = {
    println("a, b, c, d, e, ...")
}