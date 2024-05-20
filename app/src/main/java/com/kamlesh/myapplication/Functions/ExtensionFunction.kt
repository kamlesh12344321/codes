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