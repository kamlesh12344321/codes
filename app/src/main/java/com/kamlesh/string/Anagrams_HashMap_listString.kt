package com.kamlesh.string

fun groupAnagrams(words: List<String>): List<List<String>> {
    val anagramMap = HashMap<String, MutableList<String>>()

    for (word in words) {
        // Sort the word to get the key
        val sortedWord = word.toCharArray().sorted().joinToString("")

        // Add the word to the appropriate group in the map
        if (anagramMap.containsKey(sortedWord)) {
            anagramMap[sortedWord]?.add(word)
        } else {
            anagramMap[sortedWord] = mutableListOf(word)
        }
    }

    // Extract the values (groups of anagrams) from the map
    return anagramMap.values.toList()
}

fun main() {
    val words = listOf("listen", "silent", "enlist", "google", "gogole", "rat", "tar", "art")
    val groupedAnagrams = groupAnagrams(words)

    // Print the groups of anagrams
    for (group in groupedAnagrams) {
        println(group)
    }
}
