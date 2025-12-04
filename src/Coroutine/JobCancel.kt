package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi dimulai")
    val job : Job = launch { updateVersion2() }
    println("Apakah job ini selesai ? ${job.isCompleted}")
    println("Apakah job aktif ? ${job.isActive}")
    println("Apakah job dibatalkan ? ${job.isCancelled}")
    job.join()
    job.cancel()
    println("Aplikasi sedang di gunakan")
}
suspend fun updateVersion2(){
    delay(5000)
    println("Update selesai")
}