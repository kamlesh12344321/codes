package com.kamlesh.myapplication.collection

fun printLargestOfThreeNumbers(a: Int, b: Int, c: Int) {
    val largest = maxOf(a, b, c)
    println("The largest number is: $largest")
}

fun main() {
    val a = 10
    val b = 20
    val c = 15
    printLargestOfThreeNumbers(a, b, c)
}
