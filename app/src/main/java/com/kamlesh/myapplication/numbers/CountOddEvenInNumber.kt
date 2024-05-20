package com.kamlesh.myapplication.numbers

fun countOddEvenDigits(number: Long): Pair<Int, Int> {
    var num = number
    var evenCount = 0
    var oddCount = 0
    while (num != 0L) {
        val digit = (num % 10).toInt()
        if (digit % 2 == 0) {
            evenCount++
        } else {
            oddCount++
        }
        num /= 10
    }
    return Pair(evenCount, oddCount)
}

fun main() {
    val number = 123456789
    val (evenCount, oddCount) = countOddEvenDigits(number.toLong())
    println("Number of even digits: $evenCount")
    println("Number of odd digits: $oddCount")
}
