fun hitungIpk(nilai : List<Double?>): Double {
    val nilaiValid = nilai.filterNotNull()
    if (nilaiValid.isEmpty()) {
        return 0.0
    }
    val totalNilai = nilaiValid.sum()
    val jumlahMataKuliah = nilaiValid.size

    return totalNilai / jumlahMataKuliah
}

fun main() {
    val nilaiSemester1 = listOf(3.5, 4.0, null, 2.5, 3.0, null)
    val ipk1 = hitungIpk(nilaiSemester1)
    println("IPK Semester 1 : $ipk1")

    val nilaiSemester2 = listOf(null, null, null)
    val ipk2 = hitungIpk(nilaiSemester2)
    println("IPK Semester 2 : $ipk2")
}