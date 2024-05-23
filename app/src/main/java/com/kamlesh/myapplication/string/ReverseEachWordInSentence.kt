fun reverseEachWordInSentence(sentence: String): String {
    return sentence.split(" ")
        .map { it.reversed() }
        .joinToString(" ")
}

fun main() {
    val sentence = "Hello World"
    val reversedSentence = reverseEachWordInSentence(sentence)
    println(reversedSentence) // Output: olleH dlroW
}
