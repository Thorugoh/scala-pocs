error id: B907A8235026E3B9C020C884E56780C7
file://<WORKSPACE>/caseClass.scala
### java.lang.StringIndexOutOfBoundsException: Range [180, 186) out of bounds for length 180

occurred in the presentation compiler.



action parameters:
offset: 180
uri: file://<WORKSPACE>/caseClass.scala
text:
```scala
// define a case class
case class Person(
    name: String,
    vocation: String,
)

// create an instance of the case class
val p = Person("Reginald Keneeth Dwight", "Singer")

..@@
```


presentation compiler configuration:
Scala version: 3.7.0-bin-nonbootstrapped
Classpath:
<WORKSPACE>/.scala-build/fp_63c243c5a1/classes/main [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.7.0/scala3-library_3-3.7.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.16/scala-library-2.13.16.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.10.0/semanticdb-javac-0.10.0.jar [exists ], <WORKSPACE>/.scala-build/fp_63c243c5a1/classes/main/META-INF/best-effort [missing ]
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

java.lang.StringIndexOutOfBoundsException: Range [180, 186) out of bounds for length 180