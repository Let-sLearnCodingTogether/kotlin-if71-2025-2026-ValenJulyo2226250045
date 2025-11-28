data class Mana(var current:Int, var max:Int){
    operator fun plus(other:Mana):Mana{
        val newCurrent = this.current + other.current
        val newMax = maxOf(this.max, other.max)

        return Mana(
            current = minOf(newCurrent, newMax),
            max = newMax
        )
    }
    operator fun inc():Mana{
        val newCurrent = minOf(this.current + 10, this.max)
        return this.copy(current = newCurrent)
    }
    operator fun minus(value:Int) : Mana{
        val newCurrent = maxOf(this.current-value,0)
        return this.copy(current = newCurrent)
    }
}

fun main() {
    val mana1 = Mana(50,100)
    val mana2 = Mana(20,50)

    val resultPlus = mana1 + mana2
    println(resultPlus)

    var mana3 = Mana(50,100)
    mana3++
    println(mana3)

    val mana4 = mana3 - 30
    println(mana4)
}