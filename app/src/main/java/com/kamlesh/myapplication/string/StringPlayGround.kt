fun romanToInt(s: String): Int {
    val romanToIntMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var prevValue = 0

    for (i in s.length - 1 downTo 0) {
        val value = romanToIntMap[s[i]] ?: 0
        if (value < prevValue) {
            result -= value
        } else {
            result += value
        }
        prevValue = value
    }

    return result
}

fun main() {
    val romanNumeral = "MCMXCIV"
    val intValue = romanToInt(romanNumeral)
    println("$romanNumeral as an integer is $intValue")
}
