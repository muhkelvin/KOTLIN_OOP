package Object

import Class.Bird
import Class.Dog

fun main() {
    val dog = Dog()
    println(dog.name)
    dog.speak()
    val bird = Bird()
    println(bird.name)
    bird.speak()
}