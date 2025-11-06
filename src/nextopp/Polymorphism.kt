package nextopp

open class Kendaraan(){
    open fun klakson(){
        println("Suara Klakson")
    }
}
class Mobil() : Kendaraan(){}

class Motor() : Kendaraan(){
    override fun klakson() {
        println("Klakson Motor")
    }
}
fun main() {
    Mobil().klakson()
    Motor().klakson()
}