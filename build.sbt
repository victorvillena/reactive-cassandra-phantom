import Deps._

name := "reactive-cassandra-phantom"

organization := "com.tecsisa"

version := "0.0.8b-SNAPSHOT"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.11.7", "2.10.6")

scalacOptions := Seq("-deprecation", "-target:jvm-1.8", "-encoding", "utf-8")

javacOptions := Seq("-g:none")

libraryDependencies ++= {
  Seq(
    Akka.actor,
    Akka.slf4j % "runtime",
    Reactive.streams,
    Phantom.dsl,
    LoggingFrameworks.logBack,
    Testing.scalaTest,
    Reactive.streamsTck
  )
}

parallelExecution in Test := false

scmInfo := Some(ScmInfo(url("https://github.com/Tecsisa/reactive-cassandra-phantom.git"),
                            "git@github.com:Tecsisa/reactive-cassandra-phantom.git"))

licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))

PhantomSbtPlugin.projectSettings

publishArtifact in (Test, packageDoc) := false

scalariformSettings