package oop

class MahasiswaContructorDefaultValue(
    val npm : String,
    val nama : String,
    val ipk : Float = 0.0f
) {
    init {
        println("Ini block init")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaContructorDefaultValue(
        npm = "2226250045",
        nama = "Valen Julyo"
    )
    val mahasiswaKedua = MahasiswaContructorDefaultValue(
        npm = "2226250046",
        nama = "Valen Julyo Armando Davincy Lin",
        ipk = 4.0f
    )
    println(mahasiswaKedua.ipk)
}