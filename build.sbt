name := "example"

sourceDirectory in Compile <<= baseDirectory(_ / "src")

sourceDirectory in Test <<= baseDirectory(_ / "test")

externalIvyFile()
//commenting out the above line and uncommenting the below line fixes the problem
//libraryDependencies += "apache" % "commons-cli" % "1.2"

