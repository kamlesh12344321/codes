package com.kamlesh.myapplication.other

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)
}

fun main() {
    val year = 2024
    if (isLeapYear(year)) {
        println("$year is a leap year")
    } else {
        println("$year is not a leap year")
    }
}
