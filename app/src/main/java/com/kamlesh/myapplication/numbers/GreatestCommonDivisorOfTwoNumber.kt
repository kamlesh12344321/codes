package com.kamlesh.myapplication.numbers

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun main() {
    val num1 = 24
    val num2 = 36
    val gcdResult = gcd(num1, num2)
    println("GCD of $num1 and $num2 is: $gcdResult")
}
