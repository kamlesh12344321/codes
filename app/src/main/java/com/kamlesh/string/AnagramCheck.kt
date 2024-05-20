package com.kamlesh.string

fun main() {
    println(isAnagram("listen", "silent")) // Output: true
    println(isAnagram("hello", "world"))   // Output: false


}

fun isAnagram(str1: String, str2: String): Boolean {
    // Remove all non-alphanumeric characters and convert to lowercase
    val cleanStr1 = str1.replace("[^A-Za-z0-9]".toRegex(), "").toLowerCase()
    val cleanStr2 = str2.replace("[^A-Za-z0-9]".toRegex(), "").toLowerCase()

    // Check if the lengths are equal
    if (cleanStr1.length != cleanStr2.length) {
        return false
    }

    // Convert strings to char arrays, sort them, and compare
    val charArray1 = cleanStr1.toCharArray().sorted()
    val charArray2 = cleanStr2.toCharArray().sorted()

    return charArray1.joinToString("") == charArray2.joinToString("")
}