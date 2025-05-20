resolvers += "Akka library repository".at("https://repo.akka.io/maven")

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.7.0"

val AkkaVersion = "2.10.5"
val AkkaHttpVersion = "10.7.1"


lazy val root = (project in file("."))
  .settings(
    name := "docSign",
    idePackagePrefix := Some("org.thorugoh.docsign")
  )

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttpVersion
)
