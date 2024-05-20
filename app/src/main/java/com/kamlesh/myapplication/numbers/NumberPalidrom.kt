package com.kamlesh.myapplication.numbers

fun isPalindrome(number: Int): Boolean {
    val numberString = number.toString()
    return numberString == numberString.reversed()
}

fun main() {
    val number = 12321
    if (isPalindrome(number)) {
        println("$number is a palindrome")
    } else {
        println("$number is not a palindrome")
    }
}
