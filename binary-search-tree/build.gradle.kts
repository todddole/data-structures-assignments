plugins {
    id("java")
    application
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
}

application {
    mainClass.set("edu.hsutx.VerseLookup")
}

tasks.withType<JavaExec>().configureEach {
    workingDir(projectDir)
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

// Task to run the PrintTheBible application
tasks.register<JavaExec>("runPrintTheBible") {
    group = "application"
    description = "Runs the PrintTheBible application"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("edu.hsutx.PrintTheBible")
}

// Task to run the VerseLookup application
tasks.register<JavaExec>("runVerseLookup") {
    group = "application"
    description = "Runs the VerseLookup application"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("edu.hsutx.VerseLookup")
    standardInput = System.`in` // Allows the task to accept standard input

}
