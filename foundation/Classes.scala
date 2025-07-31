class Car:
    var brand: String = "Toyota"
    var topSpeed = 100

    def start() =
        println(s"Starting the $brand")

    def drive(speed: Int) =
        println(s"Driving at speed of $speed")