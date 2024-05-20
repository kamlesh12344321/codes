package com.kamlesh.myapplication.numbers

fun countDigits(number: Long): Int {
    return number.toString().length
}

fun main() {
    val number = 123456789
    val digitCount = countDigits(number.toLong())
    println("Number of digits: $digitCount")
}
