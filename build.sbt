name := """MailManager"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
   "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  "org.projectlombok" % "lombok" % "1.14.8",
  "javax.persistence" % "persistence-api" % "1.0",
  "commons-codec" % "commons-codec" % "1.10",
  "org.json" % "json" % "20131018",
  "com.googlecode.json-simple" % "json-simple" % "1.1",
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "commons-collections" % "commons-collections" % "3.2.1",
  "com.sendgrid" % "sendgrid-java" % "2.2.2",
  "com.google.code.gson" % "gson" % "2.3.1"
  
)
