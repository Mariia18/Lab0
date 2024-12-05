plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // <!-- https://mvnrepository.com/artifact/org.testng/testng --> <dependency> <groupId>org.testng</groupId> <artifactId>testng</artifactId> <version>7.10.2</version> <scope>test</scope> </dependency>

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}