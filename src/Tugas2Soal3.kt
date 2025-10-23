package oop

data class Produk(
    val nama: String,
    val harga: Int,
    val stok: Int,
    val diskon: Boolean
)
fun main() {
    val daftarProduk = listOf(
        Produk("Laptop", 12000000, 10, true),
        Produk("Mouse", 150000, 3, false),
        Produk("Keyboard", 300000, 2, true),
        Produk("Monitor", 2500000, 7, false),
        Produk("Headset", 500000, 1, true)
    )

    val produkDiskon = daftarProduk.filter { it.diskon }.map { it.nama }
    println("Produk Sedang Diskon: $produkDiskon")

    val stokMenipis = daftarProduk.filter { it.stok < 5 }.map { it.nama }
    println("Produk Stok Menipis: $stokMenipis")

    val namaProduk = daftarProduk.map { it.nama }
    println("Semua Nama Produk: $namaProduk")

}

