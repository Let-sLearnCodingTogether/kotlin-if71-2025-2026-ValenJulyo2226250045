package oop

val stokBarang = mapOf(
    "Buku Tulis Sinar Dunia" to 45,
    "Pena Pilot G-2" to 78,
    "Indomie Goreng" to 120,
    "Teh Kotak" to 30,
    "Binder B5" to 12,
    "Kopi Kapal Api" to 55
)
fun main() {
    val barangSedikit = stokBarang.minByOrNull{ it.value }
    if (barangSedikit != null) {
        println("Barang Sisa Sedikit ${barangSedikit.key} Stok :${barangSedikit.value}")
    } else
    {

    }

}