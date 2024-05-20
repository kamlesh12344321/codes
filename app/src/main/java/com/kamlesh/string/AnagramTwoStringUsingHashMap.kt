package com.kamlesh.string

fun areAnagrams(str1: String, str2: String): Boolean {
    // If lengths are not equal, they can't be anagrams
    if (str1.length != str2.length) return false

    // Function to build the frequency map of a string
    fun buildFrequencyMap(str: String): HashMap<Char, Int> {
        val frequencyMap = HashMap<Char, Int>()
        for (char in str) {
            frequencyMap[char] = frequencyMap.getOrDefault(char, 0) + 1
        }
        return frequencyMap
    }

    // Build frequency maps for both strings
    val map1 = buildFrequencyMap(str1)
    val map2 = buildFrequencyMap(str2)

    // Compare the frequency maps
    return map1 == map2
}

fun main() {
    val str1 = "listen"
    val str2 = "silent"

    if (areAnagrams(str1, str2)) {
        println("$str1 and $str2 are anagrams.")
    } else {
        println("$str1 and $str2 are not anagrams.")
    }
}
