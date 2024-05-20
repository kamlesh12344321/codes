package com.kamlesh.myapplication.other

fun fibonacciSeries(n: Int): List<Int> {
    val series = mutableListOf(0, 1)
    for (i in 2 until n) {
        series.add(series[i - 1] + series[i - 2])
    }
    return series
}

fun main() {
    val n = 10
    val series = fibonacciSeries(n)
    println("Fibonacci series up to $n terms: $series")
}
