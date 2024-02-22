package Class

data class Mobill(var merk: String, var tahunProduksi: Int)

fun main() {
    // Menggunakan fungsi run untuk menginisialisasi objek dan melakukan operasi
    val mobil = Mobill("Toyota", 2020).run {
        println("Inisialisasi mobil dengan merk: $merk, tahun produksi: $tahunProduksi")

        // Melakukan operasi pada objek (contoh: menaikkan tahun produksi)
        tahunProduksi += 1

        // Nilai terakhir dari blok run akan menjadi hasil dari run
        this
    }

    // Menampilkan informasi setelah operasi
    println("Setelah operasi, tahun produksi menjadi: ${mobil.tahunProduksi}")
}
