fun main() {
    val users : Array<String> = arrayOf("user 1", "user 2", "user 3")
    val finalExam : Array <Byte> = arrayOf(90,80,20)

    println("Users ${users[0]}")
    println("Users ${users.get(1)}")
    println("Final Exam ${finalExam[0]}")

    users.set(2, "User 3 Update")

    println("Users ${users.get(2)}")

    println("Size : ${users.size}")
}