package com.kamlesh.myapplication.numbers

fun countFactors(number: Long): Int {
    var count = 0
    var factor = 1
    while (factor * factor <= number) {
        if (number % factor == 0L) {
            count++
            if (factor.toLong() != number / factor) {
                count++
            }
        }
        factor++
    }
    return count
}

fun main() {
    val number = 36L
    val factorCount = countFactors(number)
    println("Number of factors of $number: $factorCount")
}
