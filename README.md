## Gradle tasks of interest
#### To run the application
```
./gradlew run

```

#### To run the tests
```
./gradlew test

```

#### To create a fatjar

```
./gradlew shadowJar
```

#### To run the jar
```
java -jar path/to/jar/jarname.jar
```
after running the shadowJar task, the jar is usually located in build/libs/\<jarname\>.jar