package oop

fun main() {

    val usuario1 = Usuario("Luffy", true)
    println(usuario1.caixaAlta())

    usuario1.atualizarNome("Zoro")

    println(usuario1.tamanhoCaracteres())
}