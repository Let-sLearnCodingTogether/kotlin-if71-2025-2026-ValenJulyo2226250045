package Soal1

interface NilaiAkhir<Element>{
    fun push(element: Element)
    fun pop() : Element?
    fun peek() : Element?
}

class ImplementStackNilaiAkhir<T : Any> : NilaiAkhir<T>{
    private val storage = arrayListOf<T>()

    override fun toString(): String {
        return storage.asReversed().toString()
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        if (storage.isEmpty()) return null
        return storage.removeAt(storage.size -1)
    }

    override fun peek(): T? {
        return if (storage.isNotEmpty()) storage.last() else null
    }

    fun cetak(){
        println(storage)
    }
}

fun main() {
    val na = ImplementStackNilaiAkhir<Int>()
    na.push(10)
    println(na)
    na.push(20)
    println(na)
    na.pop()
    println(na)
    na.peek()
    na.cetak()
}