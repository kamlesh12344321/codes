package com.kamlesh.string

fun main() {
    val reverseStringValue = reverseString("Kamlesh")
    println(reverseStringValue)
    println(getReverseString("Kamlesh"))
    println(getReverseStringRecursive("Kamlesh"))
}

//Using for loop

fun reverseString(input :String):String {
    var reverseString = ""
    for (i in input.length-1 downTo 0){
        reverseString += input[i]
    }
    return reverseString

}

// UsingStringBuilder

fun getReverseString(input: String):String {
    return StringBuilder(input).reverse().toString()
}

// Using recursive function

fun getReverseStringRecursive(input: String): String {
    if(input.isEmpty()){
        return input
    }

    return getReverseStringRecursive(input.substring(1))+input[0]
}