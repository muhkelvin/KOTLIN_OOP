package Class

abstract class Animal {

    abstract fun speak()
    abstract val name:String

}

class Dog : Animal(){
    override val name: String
        get() = "Bobob"
    override fun speak() {
        println("Woof")
    }
}

class Bird : Animal(){
    override val name: String
        get() = "Parrot"
    override fun speak() {
        println("Tweet")
    }
}