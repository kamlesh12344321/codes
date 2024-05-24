package com.kamlesh.myapplication.nullable

fun main() {
  safeCall()
    workingWithCollections()
}

fun nonNullable(){
    var name:String = "Kamlesh"
    // name = null // Compilation error
}

fun nullable(){
    var name:String? = "Kamlesh"
    name = null
}

fun safeCall(){
    var name:String? = "Kamlesh"
    println(name?.length)
    name = null
    println(name?.length)
}

fun elvisOperator(){
    var name:String? = "Kamlesh"
    var length = name?.length ?: -1
    println(length)
    name = null
    length = name?.length ?: -1
    println(length)
}

fun  safeCast(){
    var name:Any = "Kamlesh"
    var length = (name as? String)?.length
    println(length)
    name = 10
    length = (name as? String)?.length
    println(length)
}

fun workingWithCollections() {
    val listWithNulls: List<String?> = listOf(
        "Kamlesh",
        null,
        "Kumar",
        null,
        "Singh"
    )
    for (item in listWithNulls) {
        item?.let { println(it) } // prints non-null items
    }
}