package com.kamlesh.myapplication.Functions



fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
return op(x, y)
}

fun main() {
val result = operation(10, 5) { a, b -> a + b }
println("Result: $result") // Output: Result: 15
}
