@main
def variables(): Unit = {
    var tvShows = "many"
    println(tvShows)
    tvShows = "too many"
    println(tvShows)

    // tvshows = 5 can't change type
    val color1 = "blue"
    // color1 = "red"  / cannot be reassigned
}