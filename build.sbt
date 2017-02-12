name := """abfahrtszeiten-muenchen-backend"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaCore,
  javaJdbc,
  cache,
  javaJpa,
  javaWs,
  "dom4j" % "dom4j" % "1.6.1" intransitive(),
  "org.hibernate" % "hibernate-core" % "5.2.3.Final",
  filters
)    
