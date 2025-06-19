import scala.io.StdIn
@main
def convertKmToMiles(): Unit = {
    val input = StdIn.readLine()

    try {
        val distanceKm = input.toDouble
        val distanceMiles = distanceKm * 0.62
        println(s"Distance $distanceKm km is $distanceMiles miles")
    }catch {
        case e: NumberFormatException => {
            println("Cannot read distance")
            e.printStackTrace()
        }
    }
}