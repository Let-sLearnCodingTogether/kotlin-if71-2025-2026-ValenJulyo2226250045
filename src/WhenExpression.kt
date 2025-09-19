fun main() {
    val finalExam = 'A'
    var finalExam2 = '0'

    when(finalExam){
        'A' -> println("Lulus")
        'B' -> println("Ya, Bisa Lulus")
        'C' -> println("Lulus")
        else -> {
            println("Tidak Lulus")
        }
    }
    when(finalExam){
        'A', 'B'-> println("Lulus")
        'C' -> println("Ya, Bisa Lulus")
        else -> {
            println("Tidak Lulus")
        }
    }
    when{
        finalExam == 'A' || finalExam == 'B' -> println("Lulus")
        finalExam == 'C' -> println("Ya, Bisa Lulus")
        else -> println("Tidak Lulus")}

    when{
        finalExam2 == '0' -> println("10")
    }


}