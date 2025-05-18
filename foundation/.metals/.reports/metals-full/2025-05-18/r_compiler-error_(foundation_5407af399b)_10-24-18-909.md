error id: BE536617AA56EE9557FEC4FA363C58E0
file://<WORKSPACE>/controlStructures.scala
### java.lang.IndexOutOfBoundsException: 1

occurred in the presentation compiler.



action parameters:
offset: 2122
uri: file://<WORKSPACE>/controlStructures.scala
text:
```scala
/*
    Scala has the control structures you find in other programming languages, and also has powerful for expressions and match expressions:
*/


def ifelse(x: Int): String =
    return if(x < 0) then "negative"
    else if x == 0 then "zero"
    else "positive"


def forLoop(): Unit =
    val ints = List(1,2,3,4,5)
    for i <- ints do print(i + " ")
    println("")

    //Guard
    for i <- ints if i > 2 
    do print(i + " ")
    println("")

    // Multiple Generators and Guard

    for 
        i <- 1 to 3
        j <- 'a' to 'c'
        if j == 'b'
        if i == 2
    do 
        println(s"i = $i, j = $j")

    // Gives sam result as :
    for i <- 1 to 3 do
        for j <- 'a' to 'c' do
            if j == 'b' && i == 2 then
            println(s"i = $i, j = $j")
    

    // yelds (for expression)
    // val doubles = for i <- ints yield i * 2
    // val doubles = for (i <- ints) yield i * 2
    val doubles = for { i <- ints } yield (i * 2)
    println(doubles)
        
    
    val names = List("chirs", "ed", "maurice")
    val capNames = for name <- names yield name.capitalize
    println(capNames)
    

    val fruits = List("apple", "banana", "lime", "orange")
    // This will act like a filter / map where only fruits with length > 4 will go to the List
    val fruitsLength = for
        f <- fruits
        if f.length() > 4
    yield 
        f.length()
    
    println(fruitsLength)

case class Person(name: String, age: Int)

def matchExpression(i: Int): Unit =

    // It can be very basic acting like a switch case in Java
    i match 
        case 1 => println("one")
        case 2 => println("two")
        case 3 => println("three")
        case _ => println("other")

    // It's an expression you can bind return to a variable
    val result = i match
        case 1 => "one"
        case 2 => "two"
        case 3 => "three"
        case _ => "other"
    
    // It can be used with any data type
    val p = Person("Fred", 10)
    p match 
        case Person(name, _) if name == "Fred" => 
            println(s"$name says, Yubba dubba doo")
        case Person(name, _@@) if name == "Bam Bam" => 
            println(s"$name says, Bam bam!")
        case _ => println("Wathc the Flintstiones!")
    

@main def controlStructures(): Unit =
    // println(ifelse(-1))
    // forLoop()
    matchExpression(1)
```


presentation compiler configuration:
Scala version: 3.7.0-bin-nonbootstrapped
Classpath:
<WORKSPACE>/.scala-build/foundation_5407af399b/classes/main [exists ], <HOME>/Library/Caches/Coursier/arc/https/github.com/scala/scala3/releases/download/3.7.0/scala3-3.7.0-aarch64-apple-darwin.tar.gz/scala3-3.7.0-aarch64-apple-darwin/maven2/org/scala-lang/scala3-library_3/3.7.0/scala3-library_3-3.7.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/toolkit_3/0.7.0/toolkit_3-0.7.0.jar [exists ], <HOME>/Library/Caches/Coursier/arc/https/github.com/scala/scala3/releases/download/3.7.0/scala3-3.7.0-aarch64-apple-darwin.tar.gz/scala3-3.7.0-aarch64-apple-darwin/maven2/org/scala-lang/scala-library/2.13.16/scala-library-2.13.16.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/client4/core_3/4.0.0-RC1/core_3-4.0.0-RC1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/client4/upickle_3/4.0.0-RC1/upickle_3-4.0.0-RC1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/upickle_3/4.1.0/upickle_3-4.1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/os-lib_3/0.11.3/os-lib_3-0.11.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/model/core_3/1.7.11/core_3-1.7.11.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/shared/core_3/1.4.2/core_3-1.4.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/shared/ws_3/1.4.2/ws_3-1.4.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/client4/json-common_3/4.0.0-RC1/json-common_3-4.0.0-RC1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/ujson_3/4.1.0/ujson_3-4.1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/upack_3/4.1.0/upack_3-4.1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/upickle-implicits_3/4.1.0/upickle-implicits_3-4.1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/geny_3/1.1.1/geny_3-1.1.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/upickle-core_3/4.1.0/upickle-core_3-4.1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.10.0/semanticdb-javac-0.10.0.jar [exists ], <WORKSPACE>/.scala-build/foundation_5407af399b/classes/main/META-INF/best-effort [missing ]
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

java.lang.IndexOutOfBoundsException: 1