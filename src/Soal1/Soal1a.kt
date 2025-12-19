package Soal1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Mulai")
    launch {
        delay(3000)
        println("Download Data")
    }
    println("Selesai")

}