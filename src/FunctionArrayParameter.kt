fun array(pemainbola: Array<String>) {
    for (nama in pemainbola) {
        println(nama)
    }
}
fun main() {
    array(pemainbola = arrayOf("C Ronaldo", "Messi", "Neymar"))
}