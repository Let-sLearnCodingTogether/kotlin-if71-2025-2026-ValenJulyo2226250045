package FunctionalProgramming

fun operatorNumbers(a: Int, b: Int, operation: (Int, Int) -> Unit){
    return operation(a,b)
}

fun main() {
    println(operatorNumbers(1,3) {x, y -> println(x + y)})
    val result1 = operatorNumbers(1,3) {x, y -> println(x * y)}
    println(result1)
    println(operatorNumbers(1,3) {x, y -> println(x * y)})
    println(operatorNumbers(1,3) {x, y -> println(x - y)})

}