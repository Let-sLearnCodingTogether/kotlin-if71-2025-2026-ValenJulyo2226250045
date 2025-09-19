fun main() {
    val hari : Array<String> = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu")
    println("Jumlah elemen : ${hari.size}")
    println("Hari Pertama : ${hari.get(0)} ")
    println("Hari Terakhir : ${hari.get(6)} ")
    hari.set(4, "Jum'at Barokah")
    println(hari.get(4))
}