package com.kamlesh.myapplication.collection

fun main() {

    val intArray = listOf(1,2,3,4,5,5)
    var evenSum = 0
    var oddSum = 0

    intArray.forEach {
        if (it %2 == 0){
            evenSum += it
        } else {
            oddSum += it
        }
    }

    println(evenSum)
    println(oddSum)
}