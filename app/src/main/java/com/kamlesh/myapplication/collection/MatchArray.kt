package com.kamlesh.myapplication.collection

fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(1, 2, 3, 4, 5)

    if (array1.contentEquals(array2)) {
        println("Arrays match")
    } else {
        println("Arrays do not match")
    }
}
