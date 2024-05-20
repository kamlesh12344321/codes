package com.kamlesh.myapplication.collection

fun removeDuplicatesFromArray(array: IntArray): IntArray {
    val set = array.toSet()
    return set.toIntArray()
}

fun main() {
    val array = intArrayOf(1, 2, 3, 2, 4, 5, 1)
    val resultArray = removeDuplicatesFromArray(array)
    println(resultArray.joinToString()) // Output: 1, 2, 3, 4, 5
}
