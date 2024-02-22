package Annotation

// Anotasi pada tingkat kelas
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class InfoKelas(val keterangan: String)

// Anotasi pada tingkat fungsi
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class MetodeEksperimental(val catatan: String)

// Anotasi pada tingkat properti
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class PropertiPenting

// Menggunakan anotasi pada kelas
@InfoKelas("Kelas ini memiliki informasi tambahan")
class ContohKelas {
    // Menggunakan anotasi pada properti
    @PropertiPenting
    val nama: String = "Contoh"

    // Menggunakan anotasi pada fungsi
    @MetodeEksperimental("Fungsi ini sedang dalam pengembangan")
    fun jalankan() {
        println("Menjalankan fungsi...")
    }
}

fun main() {
    // Mendapatkan anotasi pada kelas
    val anotasiKelas = ContohKelas::class.annotations
    for (anotasi in anotasiKelas) {
        if (anotasi is InfoKelas) {
            println("Informasi kelas: ${anotasi.keterangan}")
        }
    }

    // Mendapatkan anotasi pada properti
    val anotasiProperti = ContohKelas::class.java.getDeclaredField("nama").annotations
    for (anotasi in anotasiProperti) {
        if (anotasi is PropertiPenting) {
            println("Properti ini penting.")
        }
    }

    // Mendapatkan anotasi pada fungsi
    val anotasiMetode = ContohKelas::class.java.getDeclaredMethod("jalankan").annotations
    for (anotasi in anotasiMetode) {
        if (anotasi is MetodeEksperimental) {
            println("Status eksperimental: ${anotasi.catatan}")
        }
    }
}
