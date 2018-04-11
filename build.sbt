name := "gumtree"

version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % "2.11.8",
  "org.seleniumhq.selenium" % "selenium-java" % "3.6.0",
  "org.seleniumhq.selenium" % "selenium-firefox-driver" % "3.6.0",
  "com.typesafe.play" %% "play-json" % "2.6.9",
  "org.scalatest" %% "scalatest" % "2.2.4",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
)