package colecaoDeDados

import oop.Usuario

fun main() {

    val usuarios = listOf<Usuario>(
        Usuario("Luffy", true),
        Usuario("Zoro", true),
        Usuario("Sanji", false),
    )

    val filtrados = usuarios.filter { it.isAdmin}
    // { } - Bloco de comandos
    filtrados.forEach{ println(it) }
    println("___________________________________")

    val filtrados2 = usuarios.filter { usuario -> usuario.nome.lowercase().contains("fy") }
    filtrados2.forEach { println(it) }
    println("___________________________________")

    // Lógica do filter ao contrário
    val filtrados3 = usuarios.filterNot { it.nome.lowercase().contains("fy") }
    filtrados3.forEach { println(it) }
    println("___________________________________")

    // É bom SEMPRE usar o firstOrNull
    val objfiltrado = usuarios.firstOrNull{it.nome == "Nami"} //Vai me retornar um objeto, nçao mais uma lista
    // forEach - Característica das listas
    println(objfiltrado)
}