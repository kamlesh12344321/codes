package com.kamlesh.string

fun countOccurrences(input: String): Map<Char, Int> {
    val charCount = mutableMapOf<Char, Int>()
    for (char in input) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }
    return charCount
}

fun main() {
    val input = "hello world"
    val charCount = countOccurrences(input)
    for ((char, count) in charCount) {
        println("$char: $count")
    }
}
