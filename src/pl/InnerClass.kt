package pl

class Gedung2(val nama : String){
    private val alamat : String = "Jln. Sudirman"
    inner class RuanganRapat{
        fun mulaiRapat(){
            println("Rapat di mulai")
            println("Rapat di gedung $nama di alamat $alamat")
        }
    }
}

fun main() {
    val ruanganRapat = Gedung2("MDP").RuanganRapat()
    ruanganRapat.mulaiRapat()
}