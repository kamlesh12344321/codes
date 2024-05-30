package com.kamlesh.myapplication.collection

import java.util.Arrays


/**
 * Created by Kamlesh Patel on 24/05/24.
 */


    fun main(args: Array<String>) {
        val numbers = intArrayOf(5, 2, 8, 3, 1, 6, 4, 7, 2, 3, 5, 1)

        // Remove duplicates
        val set: MutableSet<Int> = HashSet()
        for (num in numbers) {
            set.add(num)
        }

        // Convert back to array
        val uniqueNumbers = IntArray(set.size)
        var index = 0
        for (num in set) {
            uniqueNumbers[index++] = num
        }

        // Sort the array
        Arrays.sort(uniqueNumbers)
        println("Sorted Numbers (No Duplicates):")
        for (num in uniqueNumbers) {
            print("$num ")
        }
    }


fun shortInSingleLine() {
    val numbers = arrayOf(5, 2, 8, 3, 1, 6, 4, 7, 2, 3, 5, 1)

    // Remove duplicates and sort
    val sortedNumbers = numbers.toSet().sorted()

    println("Sorted Numbers (No Duplicates):")
    println(sortedNumbers.joinToString(separator = " "))
}



