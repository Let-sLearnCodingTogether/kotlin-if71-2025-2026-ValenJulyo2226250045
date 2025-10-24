package oop

class Karyawan(val nama : String, val id : String, val gajiPokok : Double){
    fun tampilkanProfil() : Unit{
        println("$nama, $id")
    }
    fun hitungGajiBulanan(jumlahHariMasuk : Int) : Double{
        return (jumlahHariMasuk / 22) * gajiPokok
    }
}

fun main() {
    val karyawan1 = Karyawan("Valen Julyo", "K001", 500_000.00)
    karyawan1.tampilkanProfil()
    println(karyawan1.hitungGajiBulanan(50))
    val karyawan2 = Karyawan("Christian Bautista", "K002", 600_000.00)
    karyawan2.tampilkanProfil()
    println(karyawan2.hitungGajiBulanan(50))


}