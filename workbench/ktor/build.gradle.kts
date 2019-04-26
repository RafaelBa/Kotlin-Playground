plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.30")
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    compile("io.ktor:ktor-server-netty:1.1.4")
}

application {
    mainClassName = "eu.codealchemist.kotlin.ktor.AppKt"
}

group = "eu.codealchemist"
version = "1.0-SNAPSHOT"
