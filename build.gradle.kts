plugins {
    java
    kotlin("jvm").version(Dependencies.Kotlin.version)
    kotlin("kapt").version(Dependencies.Kotlin.version)
}

group = "com.reyadayer"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
    maven(Dependencies.Spigot.repository)
}

dependencies {
    compile(Dependencies.Spigot.api)
    compileOnly(Dependencies.Spigot.annotations)
    kapt(Dependencies.Spigot.annotations)
    compile(Dependencies.Kotlin.stdlib)
    testCompile(Dependencies.JUnit.core)
}

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.Kotlin.classpath)
    }
}

tasks {
    withType<Jar> {
        from(configurations.getByName("compile").map { if (it.isDirectory) it else zipTree(it) })
    }

    withType<Test>().configureEach {
        useJUnitPlatform()
    }
}