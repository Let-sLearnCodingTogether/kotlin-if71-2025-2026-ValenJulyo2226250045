package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi dimulai")

    val job : Job = launch { updateVersion() }

    println("Apakah job ini selesai ? ${job.isCompleted}")
    println("Apakah job aktif ? ${job.isActive}")
    println("Apakah job dibatalkan ? ${job.isCancelled}")
    job.join()
    println("Aplikasi sedang di gunakan")

    launch {
        updateVersion()
    }
    println("Aplikasi sedang digunakan")
}
suspend fun updateVersion(){
    delay(5000)
    println("Update selesai")
}