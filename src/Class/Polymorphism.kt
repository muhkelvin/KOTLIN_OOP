package Class

// Kelas dasar atau kelas induk
open class Hewan(val nama: String) {
    // Metode bersuara umum untuk semua hewan
    open fun bersuara() {
        println("Bunyi hewan tidak ditentukan.")
    }
}

// Kelas turunan pertama
class Kucing(nama: String) : Hewan(nama) {
    // Mengoverride metode bersuara dari kelas dasar
    override fun bersuara() {
        println("$nama: Meow!")
    }
}

// Kelas turunan kedua
class Anjing(nama: String) : Hewan(nama) {
    // Mengoverride metode bersuara dari kelas dasar
    override fun bersuara() {
        println("$nama: Woof!")
    }
}

fun main() {
    // Membuat objek hewan dengan polimorfisme
    val hewan1: Hewan = Kucing("Kitty")
    val hewan2: Hewan = Anjing("Doggy")

    // Memanggil metode bersuara, meskipun tipe data referensi adalah Hewan
    hewan1.bersuara()  // Output: Kitty: Meow!
    hewan2.bersuara()  // Output: Doggy: Woof!
}
