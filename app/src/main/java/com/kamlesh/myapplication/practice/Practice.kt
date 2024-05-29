package com.kamlesh.myapplication.practice

fun main() {

//reverseString("kamlesh kumar patel")
//reverseWord("Kamlesh Kumar Patel Is here")
    val simpleArray = arrayOf("a" to 1, "b" to 2, "c" to 3, "c" to 4, "c" to 5)
    println(simpleArray.toMap())

    val name:String? = null

    println(name)
}

fun reverseString(input:String){
    var output :String = ""
    val stringList = input.toCharArray()
    for (item in stringList.reversedArray()){
       output += item
    }
    println(output)
}

fun reverseWord(input: String){
    var output = ""
    var stringArray = input.split(" ")
    for (item in stringArray) {
        var wordList = item.toCharArray()
        var temp = ""
        for (chars in wordList.reversedArray()){
            temp += chars
        }
        output+= "$temp "
    }
    println(output)

}

abstract class MyAbstraction : Patel() {

    abstract fun name()
    abstract fun data()

   fun printValue() {
        println("name")
    }
}

abstract class Patel {
    abstract  var name :String
    abstract fun getAge()

}

class Data : MyAbstraction(), Details {

    override fun name() {
        TODO("Not yet implemented")
    }

    override fun data() {
        TODO("Not yet implemented")
    }

    override var name: String
        get() = "Kamlesh"
        set(value) {

        }

    override fun getAge() {
        TODO("Not yet implemented")
    }

    override fun getNameData() {
        TODO("Not yet implemented")
    }

    override fun getAgeData() {
        TODO("Not yet implemented")
    }

}

interface Details {
    fun getNameData()
    fun getAgeData()
}




