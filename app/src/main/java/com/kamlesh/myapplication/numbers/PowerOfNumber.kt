fun power(base: Double, exponent: Int): Double {
    var result = 1.0
    for (i in 1..exponent) {
        result *= base
    }
    return result
}

fun main() {
    val base = 2.0
    val exponent = 3
    val result = power(base, exponent)
    println("$base raised to the power of $exponent is $result")
}
