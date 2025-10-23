package oop

class TranskipNilai{
    val List : List<String> by lazy {
        println("List di akses")
        listOf("A", "B", "C")
    }
}

fun main() {
    val nilaiMhs = TranskipNilai()
    println(nilaiMhs.List)
    println(nilaiMhs.List)
    println(nilaiMhs.List)
    println(nilaiMhs.List)

}