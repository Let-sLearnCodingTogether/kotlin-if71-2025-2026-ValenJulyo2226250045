package oop

class MahasiswaConstructor(val npm : String, val nama: String, var ipk : Float)

fun main() {
    val mahasiswaPertama = MahasiswaConstructor(
        npm = "2226250045",
        nama = "valen julyo",
        ipk = 1.3f
    )
    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 1.2f
    println(mahasiswaPertama.ipk )
}
