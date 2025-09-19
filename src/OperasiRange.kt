fun main() {
    val range = 0..1000
    val rangeChar = 'a'..'b'
    val rangeUntil = 1 until 10
    val rangeDownTo = 10 downTo 0


    range.forEach {
        println(it)
    }
    println(range)
    println(rangeChar)
    println(rangeUntil)
    println(rangeDownTo)
}