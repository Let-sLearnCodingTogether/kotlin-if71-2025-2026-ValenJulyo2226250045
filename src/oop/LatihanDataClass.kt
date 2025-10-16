package oop

data class GameItem(val id : Int, var name : String, var value : Int, val rarity : String)

fun main() {
    val Game : List<GameItem> = listOf(
        GameItem(1, "Pedang Besi", 100, "Common"),
        GameItem(2, "Ramuan Kesehatan", 50, "Common" ),
        GameItem(3, "Jubah Bayangan", 500, "Epic")
    )
    val cursedSword = Game[0].copy()
    cursedSword.name = "Pedang Besi Terkutuk"
    cursedSword.value = 250

    println(Game[0])
    println(cursedSword)
}