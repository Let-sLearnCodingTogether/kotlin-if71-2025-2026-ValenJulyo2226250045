package oop

data class User(val name : String)

fun main() {
    val user = User("User 1")
    val userCopy = user.copy()
    val userCopyAge = user.copy()
    print(user)
    print(userCopy)
    print(userCopyAge)
}