package com.kamlesh.myapplication.Functions


/**
 * Created by Kamlesh Patel on 15/10/24.
 */

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun String.toDateFormat(targetFormat: String = "dd-MM-yyyy"): String? {
    val inputFormats = listOf(
        "yyyy-MM-dd",
        "MM/dd/yyyy",
        "dd-MM-yyyy", // Add more formats as needed
        "yyyy/MM/dd",
        "yyyy.MM.dd",
        "dd/MM/yyyy"
    )

    for (format in inputFormats) {
        try {
            val inputFormat = SimpleDateFormat(format, Locale.getDefault())
            val date: Date = inputFormat.parse(this) ?: continue
            val outputFormat = SimpleDateFormat(targetFormat, Locale.getDefault())
            return outputFormat.format(date)
        } catch (e: Exception) {
            // Continue to the next format if parsing fails
        }
    }

    // Return null if none of the formats matched
    return null
}

// Example usage:
fun main() {
    val date1 = "2024-10-15"
    val date2 = "10/15/2024"
    val date3 = "15-10-2024"

    println(date1.toDateFormat()) // Output: 15-10-2024
    println(date2.toDateFormat()) // Output: 15-10-2024
    println(date3.toDateFormat()) // Output: 15-10-2024
}
