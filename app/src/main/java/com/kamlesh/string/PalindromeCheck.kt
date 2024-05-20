package com.kamlesh.string

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama")) // Output: true
}

fun isPalindrome(input:String):Boolean {
    val cleanStr = input.replace("[^A-Za-z0-9]".toRegex(), "").toLowerCase()
    println(cleanStr)
    return cleanStr == cleanStr.reversed()
}