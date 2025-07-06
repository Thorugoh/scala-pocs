@main
def whileLoopsNested(): Unit = {
    var i = 0
    var j = 0
    while(i < 10)
        while(j < 10)
            print(s"$i, $j\t")
            j += 1
        println()
        i += 1
        j = 0
}