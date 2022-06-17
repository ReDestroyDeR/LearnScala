ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.2"

lazy val root = (project in file("."))
  .settings(
    name := "FirstScalaProject",
    idePackagePrefix := Some("ru.red"),
  )

libraryDependencies += "org.junit.jupiter" % "junit-jupiter-api" % "5.8.2" % Test
libraryDependencies += "org.junit.jupiter" % "junit-jupiter-params" % "5.8.2" % Test
