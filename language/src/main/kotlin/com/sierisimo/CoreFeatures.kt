package com.sierisimo

import java.util.*

//Interop With Java
fun main() {
    val scanner = Scanner(System.`in`)

    val stringBuilder = StringBuilder()
}

class SierTalk {
    fun doSomethingInteresting() {
        TODO("Actually Sier does nothing interesting right now")
    }
}
//

//
//
//

// DSL support
@DslMarker
annotation class JsonBuilder

@JsonBuilder
class JsonProperty(
    var key: String,
    var value: Any
)

@JsonBuilder
class Json {
    fun property(block: JsonProperty.() -> Unit) {

    }

    fun property(key: String, block: JsonProperty.() -> Unit) {

    }
}

fun buildJson(buildBlock: Json.() -> Unit) {

}

fun talkDSLUsage() {
    val sierJson = buildJson {
        property {
            key = "name"
            value = "Sier"
        }

        property("handle") {
            value = "@sierisimo"
        }

        property("networks") {
            value = listOf("Twitter", "Github", "Medium", "Dev.to", "Club Penguin", "Reddit", "Habbo")
        }
    }
}

//
//
//

interface Validated

//Data class is basically a record or class made for holding information, it can extend other class or implement interfaces
data class UserAcces(
    val user: String,
    val password: String
) : Validated

//
//
//


//Constants
const val USER_KEY = "USERNAME"

// Null Safety
fun operateWithResponse(response: Map<String, String>?) {
    val user = response?.entries?.find { it.key == USER_KEY } ?: "default" to ""
}
