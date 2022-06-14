#### .m2/settings.xml
```
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">

  <activeProfiles>
    <activeProfile>github</activeProfile>
  </activeProfiles>

  <profiles>
    <profile>
      <id>github</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
        </repository>
        <repository>
          <id>github</id>
          <url>https://maven.pkg.github.com/KQT3/maven-library</url>
          <snapshots>
            <enabled>true</enabled>
          </snapshots>
        </repository>
      </repositories>
    </profile>
  </profiles>

  <servers>
    <server>
      <id>github</id>
      <username>username</username>
      <password>github-token...</password>
    </server>
  </servers>
</settings>
```

```
  <dependencies>
        <dependency>
            <groupId>chainqt3.blockchain</groupId>
            <artifactId>maven-library</artifactId>
            <version>${revision-chainqt3-blockchain}</version>
        </dependency>
    </dependencies>
    <properties>
        <revision-chainqt3-blockchain>0.0.5</revision-chainqt3-blockchain>
    </properties>
```

```
mvn clean install
```