package oop

class MahasiswaFunction(val nama : String){
    fun sayHello(){
        println("Selamat malam $nama")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaFunction(nama = "Mahasiswa")

    mahasiswaPertama.sayHello()
}