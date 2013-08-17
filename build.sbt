name := "example"

sourceDirectory in Compile <<= baseDirectory(_ / "src")

sourceDirectory in Test <<= baseDirectory(_ / "test")

externalIvyFile()

classpathConfiguration in Compile := config("dev")

classpathConfiguration in Test := config("dev")

classpathConfiguration in Runtime := config("dev")

