fun soma(i: Int, j: Int) = i + j
fun cat(i: String, j: String): String = "${i}${j}"

fun foo(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(a,b)
}

fun bar(a: String, b: String, processa: (String, String) -> String): String{
    return processa(a,b)
}

fun main() {
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))
}
