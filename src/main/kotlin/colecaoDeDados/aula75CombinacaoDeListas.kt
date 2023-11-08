package colecaoDeDados

fun main() {
    // Cominação 1 - Com critérios

    val a = mutableListOf("Luffy", "Zoro", "Nami")
    val b = listOf("Ussop", "Chopper","Robin")

    // Se o b fosse uma lista mutável iria apontar um erro
    // Só vai mesclar os elementos que tem a letra "p" na sua composição
    b.filterTo(a, {it.contains("p")})
    // A lista que será alterada será a "a" (mutableList)
    println(a)
    println("______________________")

    // Combinação 2 - Apenas juntas as duas listas criando uma nova lista

    val c = listOf("A", "B")
    val d = listOf("C", "D")
    val todas = listOf(c,d) // [ ] - Criando uma lista de lista
    println(todas)
    println(todas.flatten()) // Quebra as duas listas para gerar uma nova, combinando MESMO

}