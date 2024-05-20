package com.kamlesh.myapplication.collection

fun main() {
    val itemList = listOf(1,2,3,4)
    var sum = 0

    itemList.forEach {
        sum += it
    }

    println(sum)
}