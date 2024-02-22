package Class

open class Parent(val name:String) {

    fun hobby(){
        println("Mancing Bos")
    }
}

class Child(name: String):Parent(name){

    fun sleep(clock:Int){
        println("Sleep at $clock")
    }

}

