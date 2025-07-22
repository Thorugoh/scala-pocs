import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

var board = ArrayBuffer[ArrayBuffer[String]]()

@main
def ticTacToe() =
  for (i <- 0 to 2) {
    val row = ArrayBuffer[String]()
    for (j <- 0 to 2) {
      row.addOne("")
    }
    board.addOne(row)
  }
  printBoard()

  var continueGame = true
  while(continueGame)
    println("Enter a position (e.g. 1,1)")
    val input = StdIn.readLine()
    var x = 0
    var y = 0
    try
        val position = input.split(",")
        x = position(0).trim.toInt
        y = position(1).trim.toInt

        if(board(x-1)(y-1) != "")
          println("Position already taken, try again")
        else
          board(x-1)(y-1) = "X"
          printBoard()

    catch
      case e: Exception => println("Invalid input, try again.")

def printBoard() =
  println("-------------")
  for( i <- 0 to 2)
    for(j <- 0 to 2)
      board(i)(j) match
        case "X" => print("| X ")
        case "O" => print("| O ")
        case _ => print("|   ")
    println("|")
  println("-------------")


