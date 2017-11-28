import sbt._
import Keys._

object Settings {

  lazy val commonSettings = Seq(
    organization := "$organization$",
    version := "$version$" + sys.props.getOrElse("buildNumber", default=""),
    scalaVersion := "$scala_version$",
    resolvers ++= Dependencies.resolvers,
    fork in run := true,
    scalacOptions ++= commonCompileOptions,
    javaOptions ++= Seq("-Xmx4096m", "-Xms512m")
  )

  private val commonCompileOptions = Seq(
    "-target:jvm-1.8",
    "-encoding", "UTF-8",
    "-unchecked",
    "-deprecation",
    "-feature",
    "-language:reflectiveCalls",
    "-language:implicitConversions",
    "-language:dynamics",
    "-language:higherKinds",
    "-Ywarn-dead-code"
  )

  lazy val commonTestSettings = Seq(
    fork in test := true,
    parallelExecution in Test := false,
    publishArtifact in Test := false
  )

}
