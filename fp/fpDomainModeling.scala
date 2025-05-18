// When riting code in an FP style, you'll use these concepts:
    // Algebric Data types to define the data
    // Traits for functionality on the data.

// Sum types are one way to model algebric data types (ADTs) in Scala.
// They are used when data can be represented with different choices

// For instance, a pizza has three main attributes:
    // Crust size
    // Crust type
    // Toppings

enum CrustSize:
    case Small, Medium, Large

enum CrustType:
    case Thin, Thick, Regular

enum Topping:
    case Cheese, Pepperoni, BackOlives, GreenOlives, Onions

// Once with enumaration we can import its members as ordinary values

enum Nat:
    case Zero
    case Succ(pred: Nat)

def toInt(n: Nat): Int = n match {
    case Nat.Zero => 0
    case Nat.Succ(pred) => 1 + toInt(pred)

}

@main
def fpDomainModeling(): Unit = 
    val currentCrustSize = CrustSize.Small
    currentCrustSize match
        case CrustSize.Small => println("Small crust size")
        case CrustSize.Medium => println("Medium crust size")
        case CrustSize.Large => println("Large crust size")

    // enums in an `if` statement
    if currentCrustSize == CrustSize.Small then println("Small crust size")

    val two = Nat.Succ(Nat.Succ(Nat.Zero))
    println(toInt(two))

