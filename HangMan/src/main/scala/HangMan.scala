import scala.collection.mutable.ArrayBuffer
import scala.util.Random

val words = List("elbow", "writer", "circle", "polish", "bridge", "store", "fang", "scarecrow", "show", "jeans", "wilderness", "attempt", "waxing", "aftermath", "banana", "wrist", "wheel", "spring", "cherries", "nerve")
var word = ""
val guesses = ArrayBuffer[Char]()
var remainingGuesses = 6
var mistakes = 0

@main
def hangman() =
  setupGame()

def setupGame() =
  val wordIndex = Random.nextInt(words.size)
  var word = words(wordIndex).toUpperCase
  println(word)