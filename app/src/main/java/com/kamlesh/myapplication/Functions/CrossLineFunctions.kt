package com.kamlesh.myapplication.Functions

fun main() {
    callCrosslineFunction()
}

// Crossline functions

// Crossline functions are a way to tell the compiler to insert the function code directly into the call site.
// This can help in reducing the overhead of function calls and can improve the performance of the code. However,
// crossline functions can increase the size of the compiled code, so they should be used judiciously.


// Difference in inline and crossline functions

// The main difference between inline and crossline functions is that inline functions can only be used with lambda expressions,
// whereas crossline functions can be used with both lambda expressions and function references.


//How to define a crossline function

//To define a crossline function, you need to use the crossinline keyword before the lambda parameter. For example:

fun callCrosslineFunction() {
    crosslineFunction {
        println("Hello, World!")
    }
}

inline fun crosslineFunction(crossinline block: () -> Unit) {
    block()
}

//How to call a crossline function

//To call a crossline function, you can use the function name followed by the lambda expression. For example:

//fun callCrosslineFunction() {
//    crosslineFunction {
//        println("Hello, World!")
//    }

