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

    compile("org.http4k:http4k-core:3.139.0")
    compile("org.http4k:http4k-server-jetty:3.139.0")
    compile("org.http4k:http4k-client-apache:3.139.0")
}

application {
    mainClassName = "eu.codealchemist.kotlin.http4k.AppKt"
}

group = "eu.codealchemist"
version = "1.0-SNAPSHOT"
