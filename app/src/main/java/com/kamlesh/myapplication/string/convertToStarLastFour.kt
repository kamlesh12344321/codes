fun convertToStarLastFour(str: String): String {
    val lastFourStars = str.mapIndexed { index, c ->
        if (index < str.length - 4) c else '*'
    }.joinToString("")
    return lastFourStars
}

fun convertToStarStartFourChars(str: String): String {
    return if (str.length <= 4) {
        "*".repeat(str.length)
    } else {
        "****" + str.substring(4)
    }
}

fun main() {
    val str = "123456789"
    println(convertToStarLastFour(str)) // Output: ******6789
    println(convertToStarStartFourChars("123456789")) // Output: ****56789

}
