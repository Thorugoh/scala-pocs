import sbt.Keys.libraryDependencies

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.7.3"

val springBootVersion = "4.0.3"
val postgreSqlVersion = "42.7.10"
val jacksonVersion = "2.15.2"

lazy val root = (project in file("."))
  .settings(
    name := "GameStore",
    fork := true,
    libraryDependencies ++= Seq(
      "org.springframework.boot" % "spring-boot-starter-webflux" % springBootVersion,
      "org.springframework.boot" % "spring-boot-starter-jdbc" % springBootVersion,
      "org.springframework.boot" % "spring-boot-starter-actuator" % springBootVersion,
      "org.postgresql" % "postgresql" % postgreSqlVersion,
      "com.fasterxml.jackson.module" %% "jackson-module-scala" % jacksonVersion
    )
  )
