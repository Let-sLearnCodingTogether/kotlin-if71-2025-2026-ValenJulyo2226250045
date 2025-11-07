package pl

enum class DayOfTheWeek{
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}


fun main() {
    val days = DayOfTheWeek.values()

    days.forEach {
        println("${it.ordinal}. ${it.name}")
    }
    println(DayOfTheWeek.valueOf("Monday"))
    val today = DayOfTheWeek.valueOf("Monday")
    when(today){
        DayOfTheWeek.Monday -> println("Yah, senin lagi")
        DayOfTheWeek.Tuesday -> println("Hari Selasa")
        DayOfTheWeek.Wednesday-> println("Hari Rabu")
        DayOfTheWeek.Thursday -> println("Hari Kamis")
        DayOfTheWeek.Friday -> println("Hari Jumat")
        DayOfTheWeek.Saturday -> println("Hari Sabtu")
        DayOfTheWeek.Sunday -> println("Hari Minggu")
        else -> println("Opps, hari lain")


    }
}