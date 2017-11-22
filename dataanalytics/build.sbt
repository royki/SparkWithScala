import Dependencies._

lazy val root = (project in file(".")).
  settings(
  	name := "DataAnalytics",
    inThisBuild(List(
      organization := "com.royex",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),    
    libraryDependencies += scalaTest % Test,    
	libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.2.0",
	libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.2.0"
  )