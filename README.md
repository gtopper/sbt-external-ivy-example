# SBT with an external Ivy file

For some reason, when using an external Ivy file, I cannot compile the tests. It somehow happens that the test compilation classpath does not include other compiled classes (those compiled from src).

My SBT session:
```
> test
[info] Compiling 1 Java source to /home/gal/misc/sbt/sbt-external-ivy-example/target/scala-2.9.2/test-classes...
[error] /home/gal/misc/sbt/sbt-external-ivy-example/test/java/TestExample.java:5: cannot find symbol
[error] symbol  : class Example
[error] location: class TestExample
[error]   public static final Example a = new Example();
[error]                       ^
[error] /home/gal/misc/sbt/sbt-external-ivy-example/test/java/TestExample.java:5: cannot find symbol
[error] symbol  : class Example
[error] location: class TestExample
[error]   public static final Example a = new Example();
[error]                                       ^
[error] 2 errors
[error] (test:compile) javac returned nonzero exit code
[error] Total time: 1 s, completed Aug 16, 2013 5:44:49 PM
```

