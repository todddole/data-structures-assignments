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
    mainClass.set("edu.hsutx.MainApp")
}

tasks.withType<JavaExec>().configureEach {
    workingDir(projectDir)
}
