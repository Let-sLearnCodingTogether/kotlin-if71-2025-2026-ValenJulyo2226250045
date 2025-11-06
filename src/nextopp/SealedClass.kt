package nextopp

sealed class HasilOperasi(){
    data class Success(val message : String) : HasilOperasi()
    data class Error(val message: String) : HasilOperasi()
    object  Loading : HasilOperasi()
}
fun processHasil(hasilOperasi: HasilOperasi){
    when(hasilOperasi){
        is HasilOperasi.Loading -> println("System Loading")
        is HasilOperasi.Success -> println("Success")
        is HasilOperasi.Error -> println("Error")
    }
}

fun main() {
    processHasil(HasilOperasi.Loading)
    processHasil(HasilOperasi.Success("Success Message"))
    processHasil(HasilOperasi.Error("Error Message"))
}