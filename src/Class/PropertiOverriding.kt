package Class

open class Shape {
    open val corner:Int = 3
}

class Rectangle : Shape() {
    override val corner:Int = 4
}