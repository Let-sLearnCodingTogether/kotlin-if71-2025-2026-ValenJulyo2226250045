package pl

enum class DayOfTheWeek3(val isWeekend : Boolean){
    Sunday(true),
    Monday(false),
    Tuesday(false),
    Wednesday(false),
    Thursday(false),
    Friday(false),
    Saturday(true);

    fun daysUntil(target : DayOfTheWeek3) : Int{
        return if (this.ordinal < target.ordinal){
            target.ordinal - this.ordinal
        } else {
            target.ordinal - (this.ordinal + DayOfTheWeek3.values().count())
        }
    }

    companion object{
        fun today() : DayOfTheWeek3{
            val today = 0
            return DayOfTheWeek3.values().first{it.ordinal == today}
        }
    }
}

fun main() {
//    val day = DayOfTheWeek3.Thursday
//    println(day.daysUntil(DayOfTheWeek3.Friday))

    val today = DayOfTheWeek3.Monday
    val target = DayOfTheWeek3.Friday

    val sisaHari = today.daysUntil(target)
    println(sisaHari)
    println(DayOfTheWeek3.today())
}