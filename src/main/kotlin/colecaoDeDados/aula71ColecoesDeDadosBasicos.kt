package colecaoDeDados

fun main() {
    val itens = arrayOf(1,2,3,4,5)
    // it = ele - Imprima "esses" valores
    itens.forEach { println(it) }

    val itens2 = arrayOf("Maria", "João", "José")
    // Podemos nomear o it, nesse caso eu declarei como "nomes"
    itens2.forEach { nomes -> println(nomes) }

    // Podemos declarar tipos nos array
    val itens3 = doubleArrayOf(2.5,8.2,7.5)
    itens3.forEach { println(it) }
}