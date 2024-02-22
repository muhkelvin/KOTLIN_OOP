package Class

sealed class Status {
    // Sub-kelas dari sealed class Status
    class Sukses(val pesan: String) : Status()
    class Gagal(val pesan: String) : Status()
    object Loading : Status()
}

fun prosesData(status: Status) {
    // Menggunakan when expression untuk menangani berbagai kasus dari sealed class
    when (status) {
        is Status.Sukses -> {
            println("Proses berhasil: ${status.pesan}")
        }
        is Status.Gagal -> {
            println("Proses gagal: ${status.pesan}")
        }
        Status.Loading -> {
            println("Proses sedang dilakukan...")
        }
    }
}

fun main() {
    // Membuat objek dari sub-kelas sealed class
    val hasilSukses = Status.Sukses("Data berhasil diproses")
    val hasilGagal = Status.Gagal("Terjadi kesalahan dalam proses")
    val prosesLoading = Status.Loading

    // Memanggil fungsi yang menggunakan sealed class sebagai parameter
    prosesData(hasilSukses)
    prosesData(hasilGagal)
    prosesData(prosesLoading)
}
