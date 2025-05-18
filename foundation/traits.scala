trait Animal:
    def speak(): Unit

trait HasTail:
    def wagTail(): Unit

class Dog extends Animal, HasTail:
    def speak(): Unit = println("Woof")
    def wagTail(): Unit = println("⎞ ⎜ ⎛  ⎞ ⎜ ⎛")

@main
def traits(): Unit = 
    def cookie = Dog()
    cookie.speak()
    cookie.wagTail()