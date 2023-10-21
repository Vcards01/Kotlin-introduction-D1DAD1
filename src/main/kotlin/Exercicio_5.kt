// Funções de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int{
    return f(i)
}
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int{
    return f(i, j)
}
// Funções
fun soma3(i: Int, j: Int): Int{
    return i + j
}
fun multiplica(i: Int, j: Int): Int{
    return i * j
}
fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero)
            return n
    }
    return -1
}
// Main
fun main() {
// 1. Chamadas do primeiro passo
    println(processaInteiros(2, 4, ::soma3))
    println(processaInteiros(2, 4, ::multiplica))
    println(processaInteiro(4, ::raizQuadrada))
// 2. Chamadas do segundo passo
    println(processaInteiros(2, 4, { a: Int, b: Int -> a + b }))
    println(processaInteiros(2, 4, { a: Int, b: Int -> a * b }))
    println(processaInteiro(4, {a: Int ->
        for (n in 1..a) {
            if (n * n == a)
                return@processaInteiro n
        }
        return@processaInteiro -1
    }))
}