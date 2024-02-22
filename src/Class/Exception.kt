package Class

class Exception(message: String?) : Throwable(message)

fun sayHello(name:String){
    if (name.isBlank()){
        throw Exception("name cannot be blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    sayHello("")
}