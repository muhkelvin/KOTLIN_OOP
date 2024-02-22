package Class

fun bagi(a: Int, b: Int): Int {
    try {
        // Blok try: tempat kode yang mungkin memunculkan exception
        return a / b
    } catch (e: ArithmeticException) {
        // Blok catch: menangkap exception dan menangani
        println("Terjadi kesalahan aritmatika: ${e.message}")
        return 0
    } finally {
        // Blok finally: selalu dijalankan, baik terjadi exception atau tidak
        println("Akan selalu dijalankan, bahkan jika exception terjadi.")
    }
}

fun main() {
    // Contoh pemanggilan fungsi dengan exception
    val hasilBagi = bagi(10, 0)
    println("Hasil Pembagian: $hasilBagi")

    // Pemanggilan fungsi tanpa exception
    val hasilBagiLain = bagi(20, 5)
    println("Hasil Pembagian Lain: $hasilBagiLain")
}
