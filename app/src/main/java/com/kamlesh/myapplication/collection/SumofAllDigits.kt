package com.kamlesh.myapplication.collection

fun main() {
    var number = 123456
    var sum = 0
     while (number != 0){
         sum += number % 10
         number /= 10
     }
    println(sum)
}