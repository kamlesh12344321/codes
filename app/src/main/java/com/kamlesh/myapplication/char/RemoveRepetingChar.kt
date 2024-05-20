package com.kamlesh.myapplication.char

fun removeRepeatingChars(input: String): String {
    val seen = mutableSetOf<Char>()
    val result = StringBuilder()
    for (char in input) {
        if (char !in seen) {
            result.append(char)
            seen.add(char)
        }
    }
    return result.toString()
}

fun main() {
    val input = "hello"
    val output = removeRepeatingChars(input)
    println(output) // Output: helo
}
