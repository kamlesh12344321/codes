fun reverseArray(array: IntArray): IntArray {
    var start = 0
    var end = array.size - 1
    while (start < end) {
        val temp = array[start]
        array[start] = array[end]
        array[end] = temp
        start++
        end--
    }
    return array
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val reversedArray = reverseArray(array)
    println(reversedArray.joinToString()) // Output: 5, 4, 3, 2, 1
}
