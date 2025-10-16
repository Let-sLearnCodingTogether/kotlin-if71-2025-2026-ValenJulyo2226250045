fun main() {
    val ages : Array<Int> = arrayOf(25, 30, 40, 50, 60)

    println("Ages : ${ages.joinToString()}")

    
    //ages.sort()
    ages.sorted()
    println("Age Sort : ${ages.joinToString ()}")


    ages.reverse()
    println("Ages Reverse : ${ages.joinToString()}")

    println("Slice : ${ages.slice(2 .. 4).joinToString()}")
}