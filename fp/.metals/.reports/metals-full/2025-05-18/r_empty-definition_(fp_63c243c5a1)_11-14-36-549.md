error id: file://<WORKSPACE>/fpDomainModeling.scala:`<none>`.
file://<WORKSPACE>/fpDomainModeling.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Small.
	 -Small#
	 -Small().
	 -scala/Predef.Small.
	 -scala/Predef.Small#
	 -scala/Predef.Small().
offset: 666
uri: file://<WORKSPACE>/fpDomainModeling.scala
text:
```scala
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
val currentCrustSize = Sma@@ll
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.