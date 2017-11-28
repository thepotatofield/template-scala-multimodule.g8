import Dependencies._
import Settings._

lazy val $module1$ = (project in file("$module1$")).
  settings(commonSettings: _*).
  settings(commonTestSettings: _*).
  settings(libraryDependencies ++= Seq(
    scalaTest
  ))

lazy val $module2$ = (project in file("$module2$")).
  settings(commonSettings: _*).
  settings(commonTestSettings: _*).
  settings(libraryDependencies ++= Seq(
    scalaTest
  )).
  dependsOn($module1$)

lazy val root = project.in(file("."))
  .aggregate($module1$, $module2$)
