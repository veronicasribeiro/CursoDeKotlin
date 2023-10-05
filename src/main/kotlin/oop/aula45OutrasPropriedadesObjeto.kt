package oop

fun main() {
    var teste = Teste("Luffy", true)
    println(teste.label)
}

class Teste(var nome: String, var isAdmin: Boolean) {
    // var = mutável
    // val = imutável
    val label = "$nome é um administrador: $isAdmin"
}