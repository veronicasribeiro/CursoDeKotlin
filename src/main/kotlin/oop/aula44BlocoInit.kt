package oop

fun main() {
    val nomeUsuario = NomeUsuario()
    println(nomeUsuario.nome)
}

class NomeUsuario(var nome: String, var isAdmin: Boolean) {

    init {
        println("Olá usuário $nome")
    }
    constructor(nome: String) : this(nome, false) {
        println("Construtor 1")
    }
    constructor() : this("Desconhecido", false) {
        println("Construtor 2")
    }
}