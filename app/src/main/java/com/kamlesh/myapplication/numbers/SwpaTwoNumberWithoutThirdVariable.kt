package com.kamlesh.myapplication.numbers

fun swapNumbers(a: Int, b: Int): Pair<Int, Int> {
    var a = a
    var b = b
    a = a xor b
    b = a xor b
    a = a xor b
    return Pair(a, b)
}

fun main() {
    var a = 5
    var b = 10
    println("Before swap: a = $a, b = $b")
    val result = swapNumbers(a, b)
    a = result.first
    b = result.second
    println("After swap: a = $a, b = $b")
}
