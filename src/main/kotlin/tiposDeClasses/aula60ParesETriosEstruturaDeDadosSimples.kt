package tiposDeClasses

// Pair - classe que permite trabalhar com 2 valores
// Triple - classe que permite trabalhar com 3 valores

fun main() {

    // 1. Plano cartesiano (eixo x e eixo y)
    val coordenadas = Pair(10, 15)
    println(coordenadas.first)
    println(coordenadas.second)

    // 2. Logintude e Latitude (mapas)
    val coordenadasMapa = Pair(1050505154, -4555545)
    println(coordenadasMapa.first)
    println(coordenadasMapa.second)

    // 3. Associar usuário pelo ID
        // Outra forma de declarar Pair
    val usuarioPeloId = "Neymar" to 10
    println(usuarioPeloId.first)
    println(usuarioPeloId.second)

    // 4. Desconto no cartão de acordo com a bandeira
    val descontoCartao = "Visa" to 10
    println(descontoCartao.first)
    println(descontoCartao.second)


    // Trabalhar com o triple é a mesma coisa, só muda que serão 3 valores
    val coordenadasEm3d = Triple(10, 20, 30)
    println(coordenadasEm3d.first)
    println(coordenadasEm3d.second)
    println(coordenadasEm3d.third)
}