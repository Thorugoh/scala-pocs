error id: BE536617AA56EE9557FEC4FA363C58E0
file://<WORKSPACE>/fpDomainModeling.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.



action parameters:
offset: 768
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

enum Nat:
    case Zero
    case Succ(pred: Nat)

def toInt(n: Nat): Int = n match {
    case Nat.Zero => 0
    case Nat.Succ(p@@)

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



```


presentation compiler configuration:
Scala version: 3.7.0-bin-nonbootstrapped
Classpath:
<WORKSPACE>/.scala-build/fp_63c243c5a1/classes/main [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.7.0/scala3-library_3-3.7.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.16/scala-library-2.13.16.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.10.0/semanticdb-javac-0.10.0.jar [exists ], <WORKSPACE>/.scala-build/fp_63c243c5a1/classes/main/META-INF/best-effort [missing ]
Options:
-Xsemanticdb -sourceroot <WORKSPACE> -Ywith-best-effort-tasty




#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:131)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.pc.InterCompletionType$.inferType(InferExpectedType.scala:98)
	dotty.tools.pc.InterCompletionType$.inferType(InferExpectedType.scala:66)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:523)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:122)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:139)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:191)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: 0