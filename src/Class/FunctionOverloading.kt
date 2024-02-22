package Class

class StudentOverloading(val name:String) {

    fun sayHello(yourrName:String){
        println("Hello $yourrName, my name is $name")
    }

    fun sayHello(firstName:String, lastName:String){
        println("Hello $firstName $lastName, my name is $name")
    }

}