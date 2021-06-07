import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.5.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.5.10"
    kotlin("plugin.spring") version "1.5.10"
    application
}

group = "com.sierisimo"
version = "0.0.1"

application {
    mainClass.set("com.sierisimo.ApplicationKt")
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    val ktorVersion = "1.6.0"

    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-html-builder:$ktorVersion")
    implementation("io.ktor:ktor-server-host-common:$ktorVersion")
    implementation("io.ktor:ktor-locations:$ktorVersion")

    implementation("ch.qos.logback:logback-classic:1.2.3")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    implementation("org.jetbrains:kotlin-css-jvm:1.0.0-pre.146-kotlin-1.4.30")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

task("runKtor") {
    description = "Run the demo ktor"
    group = "Demo"

    dependsOn(project.tasks.getByName("run"))
}
