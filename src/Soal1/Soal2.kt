package Soal1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() : Unit = runBlocking {
    launch { layaniPelanggan("Budi") }
    launch { layaniPelanggan("Susi") }
    launch { layaniPelanggan("Anto") }
}

fun layaniPelanggan(name : String) = runBlocking {
    println("$name sedang memesan ....")
    delay(5000L)
    println("$name selesai dilayani ....")
}