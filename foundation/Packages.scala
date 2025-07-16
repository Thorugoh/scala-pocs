import scala.util.Random

// A package is a way to group related code together
// Files, functions and classes are part of packages

// package admin:
// typically packages follow directory structure
// scope (visibility) within the same package
// In order to use code from another package, that package must be imported into the project

@main
def packages(): Unit = {
    val abc = List("a", "b", "c")
    val randNb = Random.nextInt()

    // since its on same file there is no need to import
    admin.doAdmin()
    hr.doHr()
}

package admin:
    def doAdmin() = 
        println("Doing admin")

package hr:
    def doHr() =
        println("Doing Hr")