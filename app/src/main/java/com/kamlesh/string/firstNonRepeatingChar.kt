package com.kamlesh.string

fun main() {
    println(firstNonRepeatingChar("swiss")) // Output: 'w'
//    println(firstNonRepeatingChar("hello")) // Output: 'h'
//    println(firstNonRepeatingChar("aabbcc"))

}

fun firstNonRepeatingChar(input:String): Char? {
    val charCount = mutableMapOf<Char, Int>()

    input.forEach {
        charCount[it] = charCount.getOrDefault(it,0) +1
    }

    return input.firstOrNull {charCount[it] == 1}

}

//We first initialize an empty mutable map charCount to store the count of each character in the string.
//We then iterate over each character in the input string str using the forEach function.
//For each character, we update its count in the charCount map. If the character is not present in the map, we use getOrDefault to get its current count (defaulting to 0) and increment it by 1.
//After counting all characters, we iterate over the string str again using the firstOrNull function. This function returns the first element matching the given predicate (or null if no such element is found).
//For each character, we check if its count in the charCount map is equal to 1. If it is, we return that character as the first non-repeating character.
//If no non-repeating character is found (i.e., all characters have a count greater than 1), the firstOrNull function returns null