package Class

// Interface dengan dua fungsi
interface Kendaraan {
    fun bergerak()
    fun berhenti()
}

// Kelas mobil yang mengimplementasikan interface Kendaraan
class Kereta : Kendaraan {
    override fun bergerak() {
        println("Kereta bergerak maju.")
    }

    override fun berhenti() {
        println("Kereta berhenti.")
    }

    fun klakson() {
        println("Mobil bersuara tut-tut.")
    }
}

// Kelas sepeda motor yang juga mengimplementasikan interface Kendaraan
class SepedaMotor : Kendaraan {
    override fun bergerak() {
        println("Sepeda motor melaju dengan cepat.")
    }

    override fun berhenti() {
        println("Sepeda motor berhenti.")
    }

    fun belok() {
        println("Sepeda motor belok ke kanan.")
    }
}

fun main() {
    val kereta = Kereta()
    val sepedaMotor = SepedaMotor()

    // Memanggil fungsi yang diimplementasikan dari interface
    kereta.bergerak() // Output: Mobil bergerak maju.
    kereta.berhenti() // Output: Mobil berhenti.

    sepedaMotor.bergerak() // Output: Sepeda motor melaju dengan cepat.
    sepedaMotor.berhenti() // Output: Sepeda motor berhenti.

    // Memanggil fungsi tambahan dari masing-masing kelas
    kereta.klakson() // Output: Mobil bersuara tut-tut.
    sepedaMotor.belok() // Output: Sepeda motor belok ke kanan.
}
