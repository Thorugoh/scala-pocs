error id: BE536617AA56EE9557FEC4FA363C58E0
file://<WORKSPACE>/ForLoopsPractice.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.



action parameters:
offset: 501
uri: file://<WORKSPACE>/ForLoopsPractice.scala
text:
```scala
@main
def forLoopsPractice(): Unit = {
    for(x <- 1 to 10) {
        println(s"#$x: Hello how are you")
    }

    var total = 0
    for(x <- 1 to 100){
        total += x
    }
    println(s"Total is $total")

    val customers = Map("Alice" -> 4, "Judy" -> 8, "Anna" -> 6)
    for(customerName <- customers.keys)
        val purchases = customers(customerName)
        println(s" $customerName you purchase $purchases items")


    val year = 2025;
    val isLeapYear = year % 4 == 0
    val monts@@ Map(1 -> 31, 2 -> (if(isLeapYear) 29 else 30))
    for()
        
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