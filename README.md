# gradle-with-animal-sniffer
A demo project for Gradle with Animal Sniffer.

## Objectives

* JDK 11 로 빌드한다.
  * Java 11 에 없는(없어진) API 를 사용할 수 없다.
    * e.g. `javax.xml.bind.DataTypeConverter`
* Animal Sniffer 로 `java18` 에 대해 check 한다.
  * Java 8 에 없는 API 를 사용할 수 없다.
    * e.g. `ByteArrayOutputStream#writeBytes`


## `build.gradle`

```groovy
plugins {
    id 'ru.vyarus.animalsniffer' version '1.5.0'
}

sourceCompatibility = JavaVersion.VERSION_1_8

dependencies {
    signature 'org.codehaus.mojo.signature:java18:1.0@signature'
}

animalsniffer {
}
```

## `*.java`

```java
// Not available in JDK 11
//javax.xml.bind.DataTypeConverter.parseBoolean("true");

// Available only in JDK 11
new java.io.ByteArrayOutputStream().writeBytes(new byte[0]);
```