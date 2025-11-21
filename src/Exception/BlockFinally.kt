package Exception

fun validasiUmur3(umur : Int ) : Int{
    if(umur < 0){
        throw IllegalArgumentException("umur tidak boleh negatif")
    }
    return umur/0
}

fun main() {
    println("Start")
    try {
        validasiUmur3(18)
        validasiUmur3(-3)
    } catch(error: IllegalArgumentException){
        println("Error dengan message ${error.message}")
    } catch(error: ArithmeticException){
        println("Error pembagian dengan 0")
    } catch(error: Exception){
        println("Eror tidak diketahui ${error.message}")
    }
    println("Finish")
}


