package Class

// Objek Singleton untuk merepresentasikan pengaturan aplikasi
object PengaturanAplikasi {
    // Properti-Properti Pengaturan
    var namaAplikasi: String = "AplikasiKu"
    var versiAplikasi: String = "1.0"
    var modeDebug: Boolean = true

    // Metode untuk menampilkan informasi pengaturan
    fun tampilkanInformasi() {
        println("Nama Aplikasi: $namaAplikasi")
        println("Versi Aplikasi: $versiAplikasi")
        println("Mode Debug: $modeDebug")
    }
}

fun main() {
    // Mengakses properti dan metode dari objek Singleton
    println("Informasi Pengaturan Aplikasi:")
    PengaturanAplikasi.tampilkanInformasi()

    // Mengubah properti melalui objek Singleton
    PengaturanAplikasi.versiAplikasi = "2.0"

    // Menampilkan informasi setelah mengubah properti
    println("\nSetelah Memperbarui Informasi:")
    PengaturanAplikasi.tampilkanInformasi()
}
