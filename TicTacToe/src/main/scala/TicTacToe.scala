import scala.collection.mutable.ArrayBuffer

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
  board(1)(1) = "X"
  board(2)(1) = "O"
  printBoard()

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


