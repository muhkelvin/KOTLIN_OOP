package Class

data class Penggunaa(val nama: String, val umur: Int)

fun main() {
    val pengguna: Penggunaa? = Penggunaa("John", 30)

    // Menggunakan fungsi let untuk melakukan operasi pada objek
    val hasilOperasi = pengguna?.let {
        println("Nama: ${it.nama}")
        println("Umur: ${it.umur}")
        it.umur + 5 // nilai terakhir dari blok let akan menjadi hasil dari let
    }

    // Menampilkan hasil operasi
    println("Hasil Operasi: $hasilOperasi")
}
