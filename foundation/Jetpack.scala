@main
def jetpackTest(): Unit =
    val jetpack = Jetpack()
    jetpack.burn(10)
    jetpack.stop(2)

class Jetpack:
    var userHeight = 0

    def burn(seconds: Int): Unit = {
        userHeight += seconds
        
        displayHeight()
    }

    def stop(seconds: Int): Unit = {
        userHeight -= 3 * seconds
        
        if(userHeight < 0) {
            userHeight = 0   
        }

        displayHeight()
    }

    def displayHeight() = println(s"User height is now $userHeight")