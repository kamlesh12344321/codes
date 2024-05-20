package com.kamlesh.string

fun main() {
    println(compressString("aabcccccaaa")) // Output: "a2b1c5a3"
}

fun compressString(input:String):String {
    if (input.isEmpty()) return input

    val compressed = StringBuilder()
    var  count = 0
    var prevChar = input[0]

    for (i in 0 until input.length){
        if (input[i] == prevChar){
            count ++
        } else {
            compressed.append(prevChar).append(count)
            prevChar = input[i]
            count = 1
        }
    }

    compressed.append(prevChar).append(count)

    return if(compressed.length < input.length) compressed.toString() else input
}