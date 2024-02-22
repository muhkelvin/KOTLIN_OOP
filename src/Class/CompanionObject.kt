package Class

// Kelas dengan objek Companion
class Pengguna(val nama: String) {
    // Properti kelas
    var umur: Int = 0

    // Metode kelas
    fun tampilkanInformasi() {
        println("Nama: $nama")
        println("Umur: $umur tahun")
    }

    // Objek Companion
    companion object {
        // Properti dan metode objek Companion
        const val jenisKelamin: String = "Belum Ditentukan"

        fun tampilkanJenisKelamin() {
            println("Jenis Kelamin: $jenisKelamin")
        }
    }
}

fun main() {
    // Mengakses properti dan metode kelas
    val pengguna = Pengguna("John")
    pengguna.umur = 25
    pengguna.tampilkanInformasi()

    // Mengakses properti dan metode objek Companion
    Pengguna.tampilkanJenisKelamin()
}
