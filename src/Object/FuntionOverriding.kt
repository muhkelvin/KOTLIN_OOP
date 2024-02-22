package Object

import Class.Developer
import Class.Manager
import Class.Super

fun main() {
    val manajeer = Manager("Kelvin")
    println(manajeer.name)
    manajeer.jobDesk()
    val developer = Developer("Souya")
    println(developer.name)
    developer.jobDesk()
    val supersu = Super("Super")
    supersu.jobDesk()
}