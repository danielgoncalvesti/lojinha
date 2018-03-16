name := "lojinha"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  cache,
  jdbc,
  anorm,
  "com.amazonaws"     %  "aws-java-sdk" % "1.11.296",
  "com.typesafe.play" %% "play-mailer"  % "2.4.1",
  "org.webjars"       %% "webjars-play" % "2.3.0-2",
  "org.webjars"       %  "jquery"       % "2.1.3",
  "org.webjars"       %  "bootstrap"    % "3.3.7",
  "postgresql"        %  "postgresql"   % "9.1-901.jdbc4" % "runtime",
  "org.mockito"       %  "mockito-core" % "1.10.19"       % "test"
)

TwirlKeys.templateImports ++= Seq(
  "models.dao._"
)
