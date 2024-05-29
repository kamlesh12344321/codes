package com.kamlesh.myapplication.Functions

fun main() {

}

// Let scope function
// Definition: The let scope function is used to execute a block of code on a non-null object.
// It returns the result of the lambda expression.
// The let function is useful when you want to perform some operation on a non-null object.
// The let function is an extension function that is defined in the Kotlin standard library.
// The let function is defined as follows:
// inline fun <T, R> T.let(block: (T) -> R): R {
//     return block(this)
// }
fun letScopeFunction() {
    val name: String? = "Kamlesh"
    name?.let {
        println("Name is $it")
    }
}

// Run scope function
// Defination: The run scope function is used to execute a block of code on an object.
// It returns the result of the lambda expression.
// The run function is useful when you want to perform some operation on an object.
// The run function is an extension function that is defined in the Kotlin standard library.
// The run function is defined as follows:
// inline fun <T, R> T.run(block: T.() -> R): R {
//     return block()
// }
fun runScopeFunction() {
    val name: String = "Kamlesh"
    val length = name.run {
        println("Name is $this")
        this.length
    }
    println("Length of name is $length")
}

// With scope function
// Defination: The with scope function is used to execute a block of code on an object.
// It returns the result of the lambda expression.
// The with function is useful when you want to perform some operation on an object.
// The with function is an extension function that is defined in the Kotlin standard library.
// The with function is defined as follows:
// inline fun <T, R> with(receiver: T, block: T.() -> R): R {
//     return receiver.block()
// }
fun withScopeFunction() {
    val name: String = "Kamlesh"
    with(name) {
        println("Name is $this")
        println("Length of name is $length")
    }
}

// Apply scope function
// Defination: The apply scope function is used to initialize an object.
// It returns the object itself.
// The apply function is useful when you want to initialize an object with some properties.
// The apply function is an extension function that is defined in the Kotlin standard library.
// The apply function is defined as follows:
// inline fun <T> T.apply(block: T.() -> Unit): T {
//     block()
//     return this
// }

fun applyScopeFunction() {
    val person = Person().apply {
        name = "Kamlesh"
        age = 30
    }
    println("Name: ${person.name}, Age: ${person.age}")
}

class Person {
    var name: String = ""
    var age: Int = 0
}

// Also scope function
// Defination: The also scope function is used to perform some additional operation on an object.
// It returns the object itself.
// The also function is useful when you want to perform some additional operation on an object.
// The also function is an extension function that is defined in the Kotlin standard library.
// The also function is defined as follows:
// inline fun <T> T.also(block: (T) -> Unit): T {
//     block(this)
//     return this
// }
fun alsoScopeFunction() {
    val name: String = "Kamlesh"
    name.also {
        println("Name is $it")
    }
}

// Main difference in all scope functions

// The let function is used to execute a block of code on a non-null object.
// The run function is used to execute a block of code on an object.
// The with function is used to execute a block of code on an object.
// The apply function is used to initialize an object.
// The also function is used to perform some additional operation on an object.

// The let function returns the result of the lambda expression.
// The run function returns the result of the lambda expression.
// The with function returns the result of the lambda expression.
// The apply function returns the object itself.
// The also function returns the object itself.
