package com.kamlesh.string

fun firstRepeatingCharWithCount(str: String): Pair<Char, Int>? {
    val charCount = mutableMapOf<Char, Int>()

    for (char in str) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
        if (charCount[char] == 2) {
            return Pair(char, charCount[char] ?: 0)
        }
    }
    return null
}

fun main() {
    val result1 = firstRepeatingCharWithCount("abcdef")
    result1?.let { println("First repeating character: ${it.first}, Count: ${it.second}") }

    val result2 = firstRepeatingCharWithCount("hello")
    result2?.let { println("First repeating character: ${it.first}, Count: ${it.second}") }
}
