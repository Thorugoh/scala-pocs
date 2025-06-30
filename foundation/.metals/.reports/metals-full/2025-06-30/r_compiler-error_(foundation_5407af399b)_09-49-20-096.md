error id: B907A8235026E3B9C020C884E56780C7
file://<WORKSPACE>/Ranges.scala
### java.lang.StringIndexOutOfBoundsException: Range [548, 554) out of bounds for length 551

occurred in the presentation compiler.



action parameters:
offset: 548
uri: file://<WORKSPACE>/Ranges.scala
text:
```scala
// A collection that contais all the ements between two fiven values
@main 
def ranges(): Unit = {
    var r1 = 1 to 10
    println(r1.toList)

    val r2 = 'a' to 'z'
    println(r2.toList)

    var r3 = 1 until 10 // excludes last element
    println(r3.toList)

    var r4 = 'a' until 'z'  // excludes last element
    println(r4.toList)

    val r5 = 1 to 100 by 2
    println(r5.toList)

    val r6 = Range(1, 10) // uses until
    println(r6.toList)

    val r7 = Range.inclusive(1, 10)
    println(r7.toList)

    val r8 = Range(1, 10, 3) ..@@

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
java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
	java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
	java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
	java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
	java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
	java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromToIndex(Preconditions.java:112)
	java.base/jdk.internal.util.Preconditions.checkFromToIndex(Preconditions.java:349)
	java.base/java.lang.String.checkBoundsBeginEnd(String.java:4963)
	java.base/java.lang.String.substring(String.java:2925)
	dotty.tools.pc.completions.CompletionProvider.mkItem$1(CompletionProvider.scala:250)
	dotty.tools.pc.completions.CompletionProvider.completionItems(CompletionProvider.scala:356)
	dotty.tools.pc.completions.CompletionProvider.$anonfun$1(CompletionProvider.scala:149)
	scala.collection.immutable.List.map(List.scala:247)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:141)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:191)
```
#### Short summary: 

java.lang.StringIndexOutOfBoundsException: Range [548, 554) out of bounds for length 551