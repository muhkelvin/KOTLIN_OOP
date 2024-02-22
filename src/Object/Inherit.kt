package Object

import Class.Child
import Class.Parent

fun main() {
    val parent = Parent("Kiriyama")
    println(parent.name)
    println(parent.hobby())
    val child = Child("Naruto")
    println(child.name)
    println(child.sleep(2))
}