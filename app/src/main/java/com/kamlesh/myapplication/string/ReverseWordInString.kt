package com.kamlesh.myapplication.string

fun main() {
    val value = "I am kamlesh Kumar Patel"
    println(reverseWordInString(value))

}

fun reverseWordInString(input:String): String {

val regexString = input.split(" ")
    return regexString.reversed().joinToString(" ")
}