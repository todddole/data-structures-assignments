plugins {
    id("java")
}

group = "edu.hsutx"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
    // The tests print line counts and elapsed times; show them in the console.
    testLogging {
        showStandardStreams = true
    }
}
