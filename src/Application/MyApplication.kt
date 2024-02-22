package Application

import Annotation.Fancy

@Fancy("MuhKelvin")
class MyApplication(val name: String) {

    fun info(){
        println("Apllication Name: $name")
    }
}