package Class

class Kendaraann(val merk: String) {
    // Properti dari kelas outer
    private val tahunProduksi: Int = 2020

    // Metode dari kelas outer
    fun informasiKendaraan() {
        println("Kendaraan $merk, tahun produksi $tahunProduksi")
    }

    // Inner class
    inner class Mesin(val jenis: String) {
        // Metode dari inner class dapat mengakses properti dari kelas outer
        fun start() {
            println("Mesin $jenis dinyalakan pada kendaraan $merk")
        }
    }
}

fun main() {
    // Membuat objek dari kelas outer
    val mobil = Kendaraann("Toyota")

    // Membuat objek dari inner class
    val mesinMobil = mobil.Mesin("Bensin")

    // Memanggil metode dari inner class
    mesinMobil.start() // Output: Mesin Bensin dinyalakan pada kendaraan Toyota
}
