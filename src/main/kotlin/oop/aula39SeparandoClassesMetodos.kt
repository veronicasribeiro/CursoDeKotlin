package oop

fun main() {

    val usuario1 = Usuario()
    usuario1.nome = "Luffy"
    println(usuario1.caixaAlta())

    usuario1.atualizarNome("Zoro")

    println(usuario1.tamanhoCaracteres())
}