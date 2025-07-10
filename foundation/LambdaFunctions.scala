// a lamba is an anonymous function(has no name)
@main
def lambdaFunction(name: String): Unit = {
    val myLambda = (name: String) => println(s"Hello $name")
    myLambda("Alex")
}

