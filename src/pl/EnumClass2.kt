package pl

enum class DayOfTheWeek2(val isWeekend : Boolean){
    Sunday(true),
    Monday(false),
    Tuesday(false),
    Wednesday(false),
    Thursday(false),
    Friday(false),
    Saturday(true)
}

fun main() {
    val today = DayOfTheWeek2.Friday
    println("Hari ini hari : ${today.name}, hari ini adalah weekend : ${today.isWeekend}")
}