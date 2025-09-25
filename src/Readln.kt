fun main() {
    println("Nama Kamu ?")
    val name = readln()

    println("Umur kamu ?oo")
    val ageInput = readln()
    val age = ageInput.toIntOrNull()

    if(age != null){
        println("Nama Kamu =  $name")
        println("Umur Kamu = $age")
    } else {
        println("Umur Tidak Valid")
    }

}