
@main
def raw(): Unit =
    // similar to s interpolator but it does not perform scape
    // it's useful when we want to avoid expression like \n to turn into a return character.
    println(raw"a\nb") // a\nb

    val foo = 42
    println(raw"\n$foo")
