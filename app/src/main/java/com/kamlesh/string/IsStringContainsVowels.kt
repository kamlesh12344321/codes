package com.kamlesh.string

fun main() {
    println(isStringContainVowels("Hello"))
    println(isStringContainVowels("TV"))

}

fun isStringContainVowels(input:String):Boolean{
   return input.matches(".*[aeiou].*".toRegex())

}