package com.sierisimo

sealed class ApplicationState {
    object OnHold : ApplicationState()

    data class Loading(val progress: Double) : ApplicationState()

    data class Running(val information: Map<String, Any>) : ApplicationState()
}

fun next(applicationState: ApplicationState) = when (applicationState) {
    is ApplicationState.OnHold -> querySystem()
    is ApplicationState.Loading -> if (applicationState.progress < 1.0) calculateProgress(applicationState) else getRunningData()
    is ApplicationState.Running -> takeAction()
}

//
//
//

//Fun interfaces allow
fun interface Validation<T> {
    fun accept(data: T): Boolean
}

//Usage
val containsA = Validation<String> { it.contains('a') || it.contains('A') }

//Other valid usage
fun checkInformationFromQuery(query: String, vararg validations: Validation<String>) =
    validations.all { it.accept(query) }

fun buildValidationForQuery(query: String) {
    checkInformationFromQuery(
        query,
        Validation { it.startsWith("SELECT") },
        Validation { it.endsWith(";") },
        Validation { !it.contains("INSERT") }
    )
}

//
//
//
fun String.vowels(): List<Char> {
    val vowels = setOf('A', 'a', 'e', 'E', 'i', 'I', 'o', 'O', 'U', 'u')
    return filter { it in vowels }.toList()
}

val SierTalk.speaker: String
    get() = "Sinuhe"


//
//
//
//
typealias Talks = List<SierTalk>








fun querySystem(): ApplicationState = TODO("")
fun calculateProgress(applicationState: ApplicationState.Loading): ApplicationState.Loading = TODO("")
fun getRunningData(): ApplicationState.Running = TODO("")
fun takeAction(): ApplicationState = TODO("")
