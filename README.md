### Scala to Java
#### Idea
Scala is compiled into Java Byte Code which is executed by the Java Virtual Machine (JVM).

This means, that we can convert Scala code to Java code using decompiler.

You might find this repository interesting if you would like to learn more about how Scala works and how it could be translated to Java.
#### Instructions
To convert Scala code to Java in specific folder run:
```make convert_scala_to_java_for_dir DIR=YOUR_DIR``` 

To convert Scala code to Java in all folders, run:
```make convert_scala_to_java_all``` 

You can also run a GUI for a decompiler with this command:
```java -jar decompiler-gui.jar```

#### Sources
GUI decompiler:
https://github.com/java-decompiler/jd-gui

Command line decompiler:
https://github.com/leibnitz27/cfr