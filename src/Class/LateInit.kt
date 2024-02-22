package Class

class TV {
    lateinit var channel: String

    fun turnOn() {
        if (!::channel.isInitialized) {
            channel = "BBC"
            println(channel)
        } else {
            println("Channel is already initialized: $channel")
        }
    }
}

fun main() {
    val tv = TV()
    tv.turnOn()
}