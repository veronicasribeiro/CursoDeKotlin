fun main() {
    // Pair() é um data class que você pode trabalhar com valores dual
    val coordenadas = Pair(10,20) // agrupar a estrutura de dados
    println(coordenadas.first)
    println(coordenadas.second)

    // Você pode trabalhar com tipos diferentes no Pair
    val tiposDiferentes = Pair(10, "Maria")

    // FORMA ENXUTA
    val usuarioPeloID = 10 to "Tiago" // Isso é o PAIR só que de forma enxuta
    val desconto = "Visa" to 10

    // Estrutura de dados simples
    // Pair - 2
    // Triple - 3

    val triple = Triple(200,100, 50)
    println(triple.first)
    println(triple.second)
    println(triple.third)
}