plugins {
    kotlin("jvm") version "1.9.23"
    id("org.jlleitschuh.gradle.ktlint") version "12.1.1"
}

group = "org.chuong"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

apply(plugin = "org.jlleitschuh.gradle.ktlint") // Version should be inherited from parent

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
