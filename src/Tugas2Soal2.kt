val inventarisBuku: MutableMap<String, String> = mutableMapOf()

fun tambahBuku(isbn: String, judulBuku: String) {
    if (inventarisBuku.containsKey(isbn)) {
        println("Buku dengan ISBN $isbn sudah ada.")
    } else {
        inventarisBuku[isbn] = judulBuku
        println("Buku \"$judulBuku\" berhasil ditambahkan.")
    }
}

fun cariBuku(isbn: String): String {
    return inventarisBuku[isbn]?.let { "Judul: $it" } ?: "Buku tidak ditemukan."
}

fun main() {
    tambahBuku("978-602-03-8591-0", "Bumi")
    tambahBuku("978-602-06-3841-8", "Bulan")
    tambahBuku("978-602-06-3841-8", "Matahari")

    println(cariBuku("978-602-03-8591-0"))
    println(cariBuku("978-979-3062-79-8"))
    println("Daftar Buku: $inventarisBuku")
}
