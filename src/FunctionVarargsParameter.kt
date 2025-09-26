fun printUser(firstName : String ,vararg users : String) {
    println(firstName)
    for (user in users) {
        println(user)
    }
}
fun main() {
    printUser(firstName = "Test", "User 1", "User 2")
}