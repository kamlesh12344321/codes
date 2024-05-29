fun swapNumbers(a: Int, b: Int): Pair<Int, Int> {
    var temp = a
    var a = b
    var b = temp
    return Pair(a, b)
}

fun main() {
    var a = 5
    var b = 10
    println("Before swap: a = $a, b = $b")
    val result = swapNumbers(a, b)
    a = result.first
    b = result.second
    println("After swap: a = $a, b = $b")
    swapTwoNumbers(1,2)
}

fun swapTwoNumbers( a:Int, b:Int){
    var first = a
    var second = b
    println("${first} ${second}" )
    first = second.also { second = first }
    println("${first} ${second}" )

}
