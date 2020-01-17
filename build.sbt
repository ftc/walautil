name := "WalaUtil"

version := "0.1-SNAPSHOT"

organization := "edu.colorado.plv"

//scalaVersion := "2.11.11"
scalaVersion := "2.13.1"

offline := true

libraryDependencies ++= Seq(
	"com.ibm.wala" % "com.ibm.wala.shrike" % "1.5.2",
	"com.ibm.wala" % "com.ibm.wala.util" % "1.5.2",
	"com.ibm.wala" % "com.ibm.wala.core" % "1.5.2")
