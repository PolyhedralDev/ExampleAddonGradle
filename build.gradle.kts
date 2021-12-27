plugins {
    java
}

group = "com.dfsek"
version = "0.1.0"

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.codemc.io/repository/maven-public/")
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    compileOnly("com.dfsek.terra:api:6.0.0-BETA+4be63b8c6")
    compileOnly("com.dfsek.terra:manifest-addon-loader:0.1.0-BETA+4be63b8c6")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}