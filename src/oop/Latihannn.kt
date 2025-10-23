package oop

class persegiPanjang(val panjang : Double, val lebar : Double){
    val luas : Double
        get() = panjang * lebar
}

fun main() {
    val luas = persegiPanjang(10.0, 5.0)
    println(luas.luas)
}