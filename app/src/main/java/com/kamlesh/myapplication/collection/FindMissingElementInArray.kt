package com.kamlesh.myapplication.collection

fun findMissingElement(array: IntArray): Int {
    val n = array.size + 1
    val totalSum = n * (n + 1) / 2
    val arraySum = array.sum()
    return totalSum - arraySum
}

fun main() {
    val array = intArrayOf(1, 2, 4, 5, 6)
    val missingElement = findMissingElement(array)
    println("The missing element is: $missingElement")
}
