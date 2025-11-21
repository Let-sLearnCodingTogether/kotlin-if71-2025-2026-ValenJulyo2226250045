package Exception

fun validasiUmur(umur : Int){
    if(umur < 0){
        throw IllegalArgumentException("umur tidak boleh negatif")
    }
    println("umur valid ${umur}")
}
fun main() {
    println("Start")
    try {
        validasiUmur(10)
        validasiUmur(-3)
    } catch (error: IllegalArgumentException){
        println("Eror dengan message ${error.message}")
    }
    println("Finish")
}