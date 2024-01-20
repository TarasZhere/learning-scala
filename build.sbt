ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "VoiceAPIScala"
  )

lazy val upickel = project.in(file("."))
    .settings(
        scalaVersion := "3.2.2",
        libraryDependencies += "org.scala-lang" %% "toolkit" % "0.2.0"
    )