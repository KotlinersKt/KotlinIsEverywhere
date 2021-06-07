pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
        }
    }
}

rootProject.name = "KotlinIsEverywhere"

include(":language")
include(":jvm")
include(":web")
