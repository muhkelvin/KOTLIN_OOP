package Class

// Deklarasi enum class
enum class Warna {
    MERAH,
    HIJAU,
    BIRU,
    KUNING,
    UNGU
}

fun main() {
    // Menggunakan nilai dari enum class
    val warnaPertama: Warna = Warna.MERAH
    val warnaKedua: Warna = Warna.BIRU

    // Membandingkan nilai enum
    if (warnaPertama == warnaKedua) {
        println("Warna pertama sama dengan warna kedua.")
    } else {
        println("Warna pertama berbeda dengan warna kedua.")
    }

    // Menampilkan semua nilai enum class
    println("Semua warna:")
    for (warna in Warna.values()) {
        println(warna)
    }

    // Menggunakan when expression dengan enum class
    val warnaPilihan: Warna = Warna.HIJAU
    when (warnaPilihan) {
        Warna.MERAH -> println("Anda memilih warna merah.")
        Warna.HIJAU -> println("Anda memilih warna hijau.")
        Warna.BIRU -> println("Anda memilih warna biru.")
        Warna.KUNING -> println("Anda memilih warna kuning.")
        Warna.UNGU -> println("Anda memilih warna ungu.")
    }
}
