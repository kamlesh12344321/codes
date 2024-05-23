package com.kamlesh.myapplication.Functions

fun main() {
    val result = performOperation(4,5){x,y -> x+y}
    println(result)
    val double = createMultiplier(2)
    println(double(4))

}

fun performOperation (x:Int, y:Int, operation:(Int,Int) -> Int): Int {
    return operation(x, y)
}

fun createMultiplier(a:Int):(Int) -> Int {
    return {number:Int -> number * a}
}