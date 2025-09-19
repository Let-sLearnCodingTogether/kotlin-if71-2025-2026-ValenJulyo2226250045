fun main() {
    val finalExam = 'A'
    var finalExam2 = '0'
    val nilaiLulus = arrayOf('A', 'B')
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
//    var status = false
//
//    when(finalExam){
//        'A', 'B' -> status = true
//        else -> status = false
//    }
    val status = when (finalExam){
        'A', 'B' -> true
        else -> false
    }
    println(status)
    when(finalExam){
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Tidak Lulus")
    }

    when(finalExam){
        is Char -> println("Yes, Ini char")
        is String -> println("Ini String")
        !is Char -> println("Bukan Char")
    }

}