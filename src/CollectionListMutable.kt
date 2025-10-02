fun main() {
    val matakuliahWajib : MutableList<String> = mutableListOf(
        "kotlin",
        "Logika Fuzzy"
    )
    val matakuliahPilihan : MutableList<String> = mutableListOf(
        "kotlin",
        "Logika Fuzzy"
    )

    matakuliahPilihan.add("Web 2")

    println(matakuliahPilihan[0])
    println(matakuliahPilihan[1])
    println(matakuliahPilihan[2])

    matakuliahPilihan.add(index = 1, element = "Web 1")
    println(matakuliahPilihan[1])

    matakuliahPilihan.removeAt(index = 1)
    println(matakuliahPilihan)

    val matakuliah = matakuliahPilihan + matakuliahWajib
    println(matakuliah)
}