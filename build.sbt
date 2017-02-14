lazy val root = (project in file(".")).
  settings(
    name := "basic",
    version := "0.01",
    scalaVersion := "2.12.1",
    libraryDependencies ++= {
      val akkaHttpV = "10.0.3"
      Seq(
        "com.typesafe.akka" %% "akka-http"            % akkaHttpV,
        "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpV,
        "org.scalatest"     %% "scalatest"            % "3.0.1"        % "test",
        "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpV      % "test"
      )
    }
  )

