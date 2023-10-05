package oop

fun main() {
    val classe1 = Classe("Luffy")
    val classe2 = Classe("Zoro")
    Classe.resertContador()
    val classe3 = Classe("Sanji")

}

class Classe(var nome: String) {
    companion object { // Propriedades e Comportamentos da CLASSE!!!
        var contador = 0
        fun resertContador() {
            contador = 0
        }
    }

    // Propriedades e Comportamentos do OBJETO!!!
    init {
        contador++
        println(contador)
    }

}