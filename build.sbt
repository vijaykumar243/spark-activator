# http://spark.apache.org/docs/latest/quick-start.html#a-standalone-app-in-scala
name := "Spark Activator"

version := "1.0"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "0.9.1",
  "org.apache.hadoop" % "hadoop-client" % "2.4.0"
)

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
