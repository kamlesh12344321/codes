fun penultimateWord(sentence: String): String? {
    val words = sentence.trim().split("\\s+".toRegex())
    return if (words.size >= 2) {
        words[words.size - 2]
    } else {
        null
    }
}

fun main() {
    val sentence = "This is a sample sentence to get the new word"
    val penultimate = penultimateWord(sentence)
    println("Penultimate word: $penultimate")
}
