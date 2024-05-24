package com.kamlesh.myapplication.flow

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.retry
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        simpleFlow()
            .catch { e -> println("Caught exception $e") }
            .collect { value -> println(value) }
    }

    runBlocking {
        runBlocking {
            simpleFlow()
                .onCompletion { cause ->
                    if (cause != null) {
                        println("Flow completed with exception: ${cause.message}")
                    } else {
                        println("Flow completed successfully")
                    }
                }
                .catch { e -> println("Caught exception: ${e.message}") }
                .collect { value -> println(value) }
        }
    }

    runBlocking {
        simpleFlow().retry(3) { e ->
            println("Retrying due to exception: ${e.message}")
            true

        }
            .catch { e -> println("Caught exception: ${e.message}") }
            .collect { value -> println(value) }
    }

}

//Coroutine flow exception handling using catch operator

fun simpleFlow(): Flow<Int>  = flow{
    emit(1)
    emit(2)
    throw RuntimeException("Exception occurred")

}


// Coroutine flow exception handling using onCompletion operator

suspend fun singleFlowOnCompletion() = flow {
    emit(1)
    emit(2)
    throw RuntimeException("Exception occurred")
}
