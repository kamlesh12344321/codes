package com.kamlesh.myapplication.string


/**
 * Created by Kamlesh Patel on 24/05/24.
 */

fun String.isPalindrome(): Boolean {
    val cleanString = this.replace("\\s+".toRegex(), "").toLowerCase()
    return cleanString == cleanString.reversed()
}

fun main() {
    val text1 = "A man a plan a canal Panama"
    val text2 = "Hello, World!"

    println("'$text1' is palindrome: ${text1.isPalindrome()}") // Output: 'A man a plan a canal Panama' is palindrome: true
    println("'$text2' is palindrome: ${text2.isPalindrome()}") // Output: 'Hello, World!' is palindrome: false
}
