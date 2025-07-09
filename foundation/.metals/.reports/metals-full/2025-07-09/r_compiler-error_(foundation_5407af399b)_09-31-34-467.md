error id: DEFA59DFC3F9E87EDF7CFD9FA4C780E2
file://<WORKSPACE>/FunctionScope.scala
### java.lang.AssertionError: assertion failed

occurred in the presentation compiler.



action parameters:
uri: file://<WORKSPACE>/FunctionScope.scala
text:
```scala
@main
def functionScope(): Unit = {
    // println(s"I have $flowers flowers") // flower is out of scope

}

def example(): Unit =
    val flowers = 5
    def 
    println(s"U have $flowers flowers")
```


presentation compiler configuration:
Scala version: 3.7.0-bin-nonbootstrapped
Classpath:
<WORKSPACE>/.scala-build/foundation_5407af399b/classes/main [exists ], <HOME>/Library/Caches/Coursier/arc/https/github.com/scala/scala3/releases/download/3.7.0/scala3-3.7.0-aarch64-apple-darwin.tar.gz/scala3-3.7.0-aarch64-apple-darwin/maven2/org/scala-lang/scala3-library_3/3.7.0/scala3-library_3-3.7.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/toolkit_3/0.7.0/toolkit_3-0.7.0.jar [exists ], <HOME>/Library/Caches/Coursier/arc/https/github.com/scala/scala3/releases/download/3.7.0/scala3-3.7.0-aarch64-apple-darwin.tar.gz/scala3-3.7.0-aarch64-apple-darwin/maven2/org/scala-lang/scala-library/2.13.16/scala-library-2.13.16.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/client4/core_3/4.0.0-RC1/core_3-4.0.0-RC1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/client4/upickle_3/4.0.0-RC1/upickle_3-4.0.0-RC1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/upickle_3/4.1.0/upickle_3-4.1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/os-lib_3/0.11.3/os-lib_3-0.11.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/model/core_3/1.7.11/core_3-1.7.11.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/shared/core_3/1.4.2/core_3-1.4.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/shared/ws_3/1.4.2/ws_3-1.4.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/softwaremill/sttp/client4/json-common_3/4.0.0-RC1/json-common_3-4.0.0-RC1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/ujson_3/4.1.0/ujson_3-4.1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/upack_3/4.1.0/upack_3-4.1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/upickle-implicits_3/4.1.0/upickle-implicits_3-4.1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/geny_3/1.1.1/geny_3-1.1.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/upickle-core_3/4.1.0/upickle-core_3-4.1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.10.0/semanticdb-javac-0.10.0.jar [exists ], <WORKSPACE>/.scala-build/foundation_5407af399b/classes/main/META-INF/best-effort [missing ]
Options:
-Xsemanticdb -sourceroot <WORKSPACE> -Ywith-best-effort-tasty




#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:11)
	dotty.tools.dotc.parsing.Scanners$Scanner.lookahead(Scanners.scala:1124)
	dotty.tools.dotc.parsing.Parsers$Parser.termParamClause$$anonfun$1(Parsers.scala:3643)
	dotty.tools.dotc.parsing.Parsers$Parser.enclosedWithCommas(Parsers.scala:625)
	dotty.tools.dotc.parsing.Parsers$Parser.inParensWithCommas(Parsers.scala:638)
	dotty.tools.dotc.parsing.Parsers$Parser.termParamClause(Parsers.scala:3664)
	dotty.tools.dotc.parsing.Parsers$Parser.recur$5(Parsers.scala:3452)
	dotty.tools.dotc.parsing.Parsers$Parser.typeOrTermParamClauses(Parsers.scala:3467)
	dotty.tools.dotc.parsing.Parsers$Parser.defDefOrDcl(Parsers.scala:3983)
	dotty.tools.dotc.parsing.Parsers$Parser.defOrDcl(Parsers.scala:3876)
	dotty.tools.dotc.parsing.Parsers$Parser.localDef(Parsers.scala:4731)
	dotty.tools.dotc.parsing.Parsers$Parser.blockStatSeq$$anonfun$1(Parsers.scala:4759)
	dotty.tools.dotc.parsing.Parsers$Parser.checkNoEscapingPlaceholders(Parsers.scala:552)
	dotty.tools.dotc.parsing.Parsers$Parser.blockStatSeq(Parsers.scala:4765)
	dotty.tools.dotc.parsing.Parsers$Parser.block(Parsers.scala:2939)
	dotty.tools.dotc.parsing.Parsers$Parser.blockExpr$$anonfun$1(Parsers.scala:2931)
	dotty.tools.dotc.parsing.Parsers$Parser.enclosed(Parsers.scala:616)
	dotty.tools.dotc.parsing.Parsers$Parser.inBracesOrIndented(Parsers.scala:646)
	dotty.tools.dotc.parsing.Parsers$Parser.inDefScopeBraces(Parsers.scala:652)
	dotty.tools.dotc.parsing.Parsers$Parser.blockExpr(Parsers.scala:2929)
	dotty.tools.dotc.parsing.Parsers$Parser.simpleExpr(Parsers.scala:2760)
	dotty.tools.dotc.parsing.Parsers$Parser.$init$$$anonfun$10(Parsers.scala:2713)
	dotty.tools.dotc.parsing.Parsers$Parser.postfixExpr(Parsers.scala:2689)
	dotty.tools.dotc.parsing.Parsers$Parser.expr1(Parsers.scala:2531)
	dotty.tools.dotc.parsing.Parsers$Parser.expr(Parsers.scala:2421)
	dotty.tools.dotc.parsing.Parsers$Parser.$init$$$anonfun$9(Parsers.scala:2397)
	dotty.tools.dotc.parsing.Parsers$Parser.subPart(Parsers.scala:716)
	dotty.tools.dotc.parsing.Parsers$Parser.subExpr(Parsers.scala:2399)
	dotty.tools.dotc.parsing.Parsers$Parser.defDefOrDcl(Parsers.scala:3995)
	dotty.tools.dotc.parsing.Parsers$Parser.defOrDcl(Parsers.scala:3876)
	dotty.tools.dotc.parsing.Parsers$Parser.topStatSeq(Parsers.scala:4609)
	dotty.tools.dotc.parsing.Parsers$Parser.topstats$1(Parsers.scala:4801)
	dotty.tools.dotc.parsing.Parsers$Parser.compilationUnit$$anonfun$1(Parsers.scala:4806)
	dotty.tools.dotc.parsing.Parsers$Parser.checkNoEscapingPlaceholders(Parsers.scala:552)
	dotty.tools.dotc.parsing.Parsers$Parser.compilationUnit(Parsers.scala:4811)
	dotty.tools.dotc.parsing.Parsers$Parser.parse(Parsers.scala:209)
	dotty.tools.dotc.parsing.Parser.parse$$anonfun$1(ParserPhase.scala:32)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:510)
	dotty.tools.dotc.parsing.Parser.parse(ParserPhase.scala:40)
	dotty.tools.dotc.parsing.Parser.$anonfun$2(ParserPhase.scala:52)
	scala.collection.Iterator$$anon$6.hasNext(Iterator.scala:479)
	scala.collection.Iterator$$anon$9.hasNext(Iterator.scala:583)
	scala.collection.immutable.List.prependedAll(List.scala:152)
	scala.collection.immutable.List$.from(List.scala:685)
	scala.collection.immutable.List$.from(List.scala:682)
	scala.collection.IterableOps$WithFilter.map(Iterable.scala:900)
	dotty.tools.dotc.parsing.Parser.runOn(ParserPhase.scala:51)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:367)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1324)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:360)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1$$anonfun$2(Run.scala:407)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1$$anonfun$adapted$1(Run.scala:407)
	scala.Function0.apply$mcV$sp(Function0.scala:42)
	dotty.tools.dotc.Run.showProgress(Run.scala:469)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:407)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:419)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:69)
	dotty.tools.dotc.Run.compileUnits(Run.scala:419)
	dotty.tools.dotc.Run.compileSources(Run.scala:306)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:161)
	dotty.tools.pc.CachingDriver.run(CachingDriver.scala:45)
	dotty.tools.pc.WithCompilationUnit.<init>(WithCompilationUnit.scala:31)
	dotty.tools.pc.SimpleCollector.<init>(PcCollector.scala:351)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:152)
```
#### Short summary: 

java.lang.AssertionError: assertion failed