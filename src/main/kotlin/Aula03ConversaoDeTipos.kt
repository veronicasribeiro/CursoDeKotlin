fun main() {
    val mediaDePreco: Int = 22
    println(mediaDePreco::class)

    // Eu quero imprimir para o usuário com a casa decimal...

    // CONVERTER O TIPO

    val mediaDePrecoConvertida = mediaDePreco.toDouble()

    println(mediaDePrecoConvertida)
    println(mediaDePrecoConvertida::class)
}