@main
def moreForLoops(): Unit = {
    for (row <- 1 to 5; column <- 3 to 9)
        println(s"x = $row, y=$column")

    for(row <- 1 to 5)
        for(column <- 1 to 5)
            print(s"$row, $column \t")
    println()
}