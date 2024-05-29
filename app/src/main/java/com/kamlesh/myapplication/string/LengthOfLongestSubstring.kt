package com.kamlesh.myapplication.string

fun main() {
    println(lengthOfLongestSubstring("abcabcbb"))
}

fun lengthOfLongestSubstring(str:String):Int {
    var maxLength = 0
    var start = 0
    val charMap = mutableMapOf<Char, Int>()

    for (end in str.indices){
        val currentChar = str[end]
        if (charMap.containsKey(currentChar)){
            start = maxOf(start, charMap[currentChar]!! +1)
        }
        charMap[currentChar] = end
        maxLength = maxOf(maxLength,end-start +1)
    }
    return maxLength
}