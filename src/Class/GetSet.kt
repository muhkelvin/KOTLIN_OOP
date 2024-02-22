package Class

class Mobil {
    // Properti dengan getter dan setter
    var kecepatan: Int = 0
        get() = field // Getter untuk mengakses nilai properti
        set(value) {
            field = if (value > 0) value else 0 // Setter untuk mengubah nilai properti
        }

    // Properti hanya dengan getter (read-only)
    val merk: String = "Toyota"
        get() = field // Getter untuk mengakses nilai properti

    // Properti dengan custom getter dan setter
    var tahunProduksi: Int = 2020
        get() {
            println("Mengakses tahun produksi")
            return field
        }
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Tahun produksi harus lebih dari 0")
            }
        }
}

fun main() {
    val mobil = Mobil()

    println("Merk Mobil: ${mobil.merk}") // Output: Toyota
    println("Kecepatan Awal: ${mobil.kecepatan}") // Output: 0

    mobil.kecepatan = 60
    println("Kecepatan Setelah Diubah: ${mobil.kecepatan}") // Output: 60

    mobil.tahunProduksi = 2022
    println("Tahun Produksi: ${mobil.tahunProduksi}") // Output: 2022

    mobil.tahunProduksi = -1 // Akan mencetak pesan karena tahun produksi tidak boleh kurang dari 0
}
