import sbt._

object Dependencies {

  // resolvers
  // List of predefined resolvers: http://www.scala-sbt.org/1.x/docs/Resolvers.html#Predefined
  lazy val resolvers = Seq(
    Resolver sonatypeRepo "public"
  )

  // libraries
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.4" % Test

}
