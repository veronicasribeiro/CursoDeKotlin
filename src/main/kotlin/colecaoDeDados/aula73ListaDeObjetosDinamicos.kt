package colecaoDeDados

import oop.Usuario

fun main() {

    val usuarios = listOf(
        Usuario("Superman", false),
        Usuario("Batman", true),
        Usuario("Mulher Maravilha", false)
    )
    println(usuarios[1])
    println("____________________________________")

    // Podemos acessar elementos de uma outra forma
    println(usuarios.first()) // Devolve o primeiro item da lista
    println(usuarios.last()) // Devolve o último item da lista
    println(usuarios.firstOrNull()) // Devolve o primeiro item ou vazio
    println("____________________________________")

    // A lista está vazia? Vai me retornar um valor boolean
    println(usuarios.isEmpty()) // Empty - Vazio
    println(usuarios.isNullOrEmpty()) // A lista é vazia ou nula?
    println("____________________________________")

    // Podemos criar a lista de uma forma mais rápida

    val emptyList = emptyList<Usuario?>()
    println(emptyList)

    // Você pode utilizar essa função para devolver algo vazio na tela.
    // Ex: Listagem de contatos, a lista não veio preechida.

}