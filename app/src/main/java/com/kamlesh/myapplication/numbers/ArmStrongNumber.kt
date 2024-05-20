package com.kamlesh.myapplication.numbers

fun isArmstrong(number: Int): Boolean {
    var num = number
    val numDigits = num.toString().length
    var sum = 0
    while (num > 0) {
        val digit = num % 10
        sum += Math.pow(digit.toDouble(), numDigits.toDouble()).toInt()
        num /= 10
    }
    return sum == number
}

fun main() {
    val number = 153
    if (isArmstrong(number)) {
        println("$number is an Armstrong number")
    } else {
        println("$number is not an Armstrong number")
    }
}
