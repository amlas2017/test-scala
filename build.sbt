name := "test-scala"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.3.3",
  "org.apache.spark" %% "spark-sql" % "2.3.3"
)

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "2.2.1"

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.12"

