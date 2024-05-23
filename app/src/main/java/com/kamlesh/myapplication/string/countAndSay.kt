package com.kamlesh.myapplication.string

fun main() {
//    println(countAndSay(1)) // Output: "1"
//    println(countAndSay(2)) // Output: "11"
//    println(countAndSay(3)) // Output: "21"
//    println(countAndSay(4)) // Output: "1211"
    println(countAndSay(5)) // Ou
}

fun countAndSay(n:Int):String {
    if (n == 1) return "1"
    var result = "1"

    for (i in 2..n){
        val sb = StringBuilder()
        var count = 1
        for (j in 1 until result.length){
            if (result[j] == result[j-1]){
                count++
            } else {
                sb.append(count).append(result[j-1])
                count = 1
            }
        }
        sb.append(count).append(result[result.length - 1])
        result = sb.toString()
    }
    return  result

}