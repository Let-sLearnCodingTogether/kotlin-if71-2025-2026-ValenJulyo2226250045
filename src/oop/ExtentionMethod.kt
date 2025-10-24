package oop

class UserProfile1(val username : String){}

fun UserProfile1.usernameToUpperCase() : String {
    return this.username.uppercase()
}

fun main() {
    val user1 = UserProfile1("Budi")
    println(user1.usernameToUpperCase())
}