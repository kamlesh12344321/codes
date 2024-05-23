package com.kamlesh.myapplication.string

fun main() {
    val subs = getAllPossibleSubString("ab")
    subs.forEach {
        println(it)
    }

}

fun getAllPossibleSubString(input:String): List<String>{

    val subStrings = mutableListOf<String>()

    for (i in input.indices){
        for (j in i + 1..input.length) {
            subStrings.add(input.substring(i, j))
        }
    }
    return  subStrings
}