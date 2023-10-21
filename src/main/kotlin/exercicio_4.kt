fun soma1(i: Int, j: Int) = i + j
fun cat1(i: String, j: String): String = "${i}${j}"

fun <T> xpto(a: T, b: T, operacao: (T, T)-> T): T {
    return operacao(a,b)
}

fun main() {
    println(xpto(2, 3, ::soma1))
    println(xpto("Jo", "ão", ::cat1))
}
