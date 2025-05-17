
@main
def hello(): Unit =
    val height = 1.71d
    val name = "Victor"
    println(f"$name%s is $height%2.2f meters tall")

    // use %% as in java to get a literal % when using interpolator
    println("f3/19 is less then 20%%")