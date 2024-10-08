plugins {
    java
    checkstyle
    id("com.github.johnrengelman.shadow") version ("7.1.2")
}

group = "net.burningtnt"
version = "1.0-SNAPSHOT"
description = "A tool to automatically download artifacts from GitHub Action and upload them to current repository."

repositories {
    mavenCentral()
}

tasks.compileJava {
    options.compilerArgs.add("-Xlint:all")
}

checkstyle {
    sourceSets = mutableSetOf()
}

tasks.getByName("build") {
    dependsOn(tasks.getByName("checkstyleMain") {
        group = "build"
    })
    dependsOn(tasks.getByName("checkstyleTest") {
        group = "build"
    })
    dependsOn(tasks.getByName<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
        manifest {
            attributes(
                "Main-Class" to "net.burningtnt.hmclfetcher.Main"
            )
        }
    })
}

dependencies {
    implementation("com.google.code.gson:gson:2.10.1")
}