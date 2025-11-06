package nextopp

open class Pegawai(val nama : String, val gajiDasar : Int){
    fun hitungGaji(){
        println("$nama memperoleh gaji dengan nominal Rp. $gajiDasar")
    }
}

class Manager(nama : String, gajiDasar: Int) : Pegawai(nama,gajiDasar)
class Progammer(nama : String, gajiDasar: Int) : Pegawai(nama,gajiDasar)

fun main() {
    val manager = Manager("Budi", 500000 )
    manager.hitungGaji()

    val progammer = Progammer("CB", 250000)
    progammer.hitungGaji()

    val listManager : List<Pegawai> = listOf(
        Manager("Budi", 500000),
        Manager("Santo", 300000),
        Manager("Toni", 150000)
    )

    listManager.forEach { pegawai -> pegawai.hitungGaji() }

}

