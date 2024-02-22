package Class

data class Product(val name: String, val price: Double)  {
}

fun main() {
    val product = Product("kotlin", 100.0)
    println(product)
    println(product.price)
    println(product.name)
    val product2 = product.copy()
    println(product2)
    println(product2.price)
    println(product2.name)
    val product3 = product.copy(price = 200.0)
    println(product3)
    println(product3.price)
    println(product3.name)
}