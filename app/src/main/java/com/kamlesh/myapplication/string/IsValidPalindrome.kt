fun isPalindrome(s: String): Boolean {
    val cleanString = s.filter {
        it.isLetterOrDigit()
    }.toLowerCase()
    return cleanString == cleanString.reversed()
}

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama")) // Output: true
    println(isPalindrome("race a car"))                      // Output: false
}
