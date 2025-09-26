fun main() {
    var student : String = "Student 1"
    println(student)

//    student = null

    var prodiIF : String? = null
    println(prodiIF?.length)


    var prodiSI : String? = null
    println(prodiSI ?: "Tanpa Prodi")

    var token : String? = null
    println(token!!. length)

    val email: String? = "test@gmail.com"
    if(email != null){
        println("Panjang email : ${email.length}")
    }
}