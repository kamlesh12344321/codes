package com.kamlesh.string

fun capitalizeFirstChar(sentence: String): String {
    val words = sentence.split(" ")
    val capitalizedWords = words.map { it.capitalize() }
    return capitalizedWords.joinToString(" ")
}

fun main() {
    val sentence = "hello world"
    val capitalizedSentence = capitalizeFirstChar(sentence)
    println(capitalizedSentence) // Output: Hello World
}
