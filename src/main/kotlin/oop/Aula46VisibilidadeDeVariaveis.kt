package oop

fun main() {
    val visibilidade = Visibilidade("Luffy Maria José", true)
    println(visibilidade.maxNomeLength())

}

class Visibilidade(var nome:String, var isAdmin: Boolean) {

    private val MAX_NOME_LENGTH = 8 // Padrão UPPER_CASE

    fun maxNomeLength() {
        if (nome.length > MAX_NOME_LENGTH) {
            println("Nome Inválido")
        }else {
            println("O usuário $nome é administrador: $isAdmin")
        }
    }
}