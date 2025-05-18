import java.io.IOException
def writeTextToFile(text: String): Unit = 
    throw IOException()
    

@main def tryCatchFinally(): Unit =
    try 
        writeTextToFile("text")
    catch
        case ioe: IOException => println("Got an IOException")
        case nfe: NumberFormatException => println("Got a NumberFormatException")
    finally
        println("Clean up your resources here")
    