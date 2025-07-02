error id: BE536617AA56EE9557FEC4FA363C58E0
file://<WORKSPACE>/PatternMatchingPractice.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.



action parameters:
offset: 822
uri: file://<WORKSPACE>/PatternMatchingPractice.scala
text:
```scala
import scala.io.StdIn
@main
def patternMatchingPractice(): Unit = {
    println("How many meals do you have per day?")
    val meals = 3

    meals match
        case x if 0 to 2 contains meals => println("You should eat more")
        case 3 => println("That's perfect")
        case _ => println("You should eat less")

    val name = "alex"
    name(0).toUpper match
        case 'A' | 'B' | 'C' => println(s"Hello $name, welcome!")
        case x if 'D' to 'H' contains name(0) => println(s"Hi $name, how are you?")
        case _ => println("Hi")


    val currentHour = 5
    currentHour match
        case x if 6 to 11 contains currentHour => println("morning")
        case x if 12 to 14 contains currentHour => println("noon")
        case x if 15 to 17 contains currentHour => println("afternoon")
        case x@@18 to 21 => println("evening")
        case 22 to 5 => println("night")
        
    
    
}
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

java.lang.IndexOutOfBoundsException: 0