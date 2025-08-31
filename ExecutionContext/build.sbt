ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"

libraryDependencies += "com.google.guava" % "guava" % "33.0.0-jre"

lazy val root = (project in file("."))
  .settings(
    name := "ExecutionContext"
  )
