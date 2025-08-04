
@main
def classesPratcie(): Unit = 
    var animal = Animal()
    animal.run()
    animal.topSpeed = 100
    animal.run()


class Car:
    var brand: String = "Toyota"
    var topSpeed = 100

    def start() =
        println(s"Starting the $brand")

    def drive(speed: Int) =
        println(s"Driving at speed of $speed")


class Animal:
    var topSpeed = 50

    def run(): Unit = 
        println(s"top speed: $topSpeed")