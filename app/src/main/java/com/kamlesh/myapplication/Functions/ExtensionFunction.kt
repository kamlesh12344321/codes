package com.kamlesh.myapplication.Functions

fun main() {
    val original = "Kamlesh"
    val reversed = original.reverse()
    println(reversed)

    val user = User("Kamlesh",20)
    println(user.isAdult())

    val inputString = "Kamlesh Patel"
    val result = inputString.transforms { it.uppercase() }
    println(result)

}

fun String.reverse():String {
    return this.reversed()
}

fun User.isAdult():Boolean {
    return this.age > 18
}

class User(
    val name:String,
    val age:Int
)

// When the higher order function

inline fun String.transforms(transformer:(String) -> String):String {
    return transformer(this)
}


// Extension functions are a way to add new functionality to existing classes without modifying their source code.
// In Kotlin, you can define an extension function using the extension function syntax.
// The extension function syntax consists of the class name followed by a dot and the function name. For example:
// fun ClassName.functionName() {
//     // function body
// }

// The extension function syntax can be used to define extension functions for any class,
// including built-in classes and user-defined classes.

// How to define an extension function

// To define an extension function, you need to use the extension function syntax.

// For example, to define an extension function for the String class that reverses a string,
// you can use the following code:

// fun String.reverse(): String {
//     return this.reversed()
// }

// In this code, the reverse function is an extension function for the String class.

// How to call an extension function

// To call an extension function, you can use the dot notation on an instance of the class.

// For example, to call the reverse function on a string, you can use the following code:

// val original = "Kamlesh"
// val reversed = original.reverse()
// println(reversed)
