package com.kamlesh.myapplication


/**
 * Created by Kamlesh Patel on 18/10/24.
 */

fun main() {
    val  abstractPractice = AbstractPractice()
    abstractPractice.getName()
    println(abstractPractice.nameData)
    abstractPractice.setName()
}
 class AbstractPractice : NameClass() {
    override var nameData: String
        get() = "rr"
        set(value) {
            nameData = "pp"
        }

    override fun getName() {
        println(nameData)
    }
}

abstract class NameClass {

   abstract var nameData:String
   lateinit var surname:String
    abstract fun getName()
    fun setName() {
        surname = "Patel"
        println(surname)
    }

}