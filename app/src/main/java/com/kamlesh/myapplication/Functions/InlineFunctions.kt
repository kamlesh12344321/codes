package com.kamlesh.myapplication.Functions

fun main() {
//    printMessage("Hello, World!")

    callInlineFunction()
}
// Inline functions

// Inline functions are a way to tell the compiler to insert the function code directly into the call site.
// This can help in reducing the overhead of function calls and can improve the performance of the code. However,
// inline functions can increase the size of the compiled code, so they should be used judiciously.

//How to define an inline function

//To define an inline function, you need to use the inline keyword before the fun keyword. For example:

inline fun printMessage(message: String) {
    println(message)
}

//How to call an inline function

//To call an inline function, you can use the function name followed by the arguments. For example:

fun callInlineFunction() {
    printMessage("Hello, World!")
}

//When you call an inline function, the compiler will replace the function call with the actual function code at the call site.
// This can help in reducing the overhead of function calls and can improve the performance of the code.

//When to use inline functions

//Inline functions are useful when you have small functions that are called frequently.