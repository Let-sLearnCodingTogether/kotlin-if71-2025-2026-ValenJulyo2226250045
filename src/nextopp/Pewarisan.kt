package nextopp

open class Hewan(val name : String){
    open fun suara(){
        println("Suara Hewan")
    }
}
class Ayam(name : String) : Hewan(name){
    override fun suara() {
        println("Kuku Ruyuk")
    }
}
//class AnakAyam(name : String) : Ayam(name){
//    override fun suara() {
//        println("Petok petok")
//    }
//}

fun main() {
    val rembo = Ayam("Rembo")
    rembo.suara()
}