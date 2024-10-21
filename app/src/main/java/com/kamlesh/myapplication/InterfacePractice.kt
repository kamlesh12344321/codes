package com.kamlesh.myapplication


/**
 * Created by Kamlesh Patel on 18/10/24.
 */


fun main() {
    val interfacePractice = InterfacePractice()
    interfacePractice.printa("kamlesh")
    interfacePractice.printa("kamlesh","Patel")
}
class InterfacePractice: A {
    override fun printa() {
      println("printing a")
    }

    override fun printa(name: String, surname: String) {
        println("printing $name $surname")
    }

    override fun printa(name: String) {
        println("printing $name")
    }
}

interface A : B{
     override fun printa()
    fun printa( name:String)

}

interface B {
    fun printa()
    fun printa( name:String, surname:String)

}