package colecaoDeDados

import oop.Usuario

fun main() {

    val usuarios = mutableListOf<Usuario>(
        Usuario("Luffy", true),
        Usuario("Zoro", false),
        Usuario("Sanji", false)
    )

    usuarios.forEach { println(it) }
    println("__________________________________")

    // Você pode atualizar (update) a lista
    usuarios[0] = Usuario("Robin", true)
    usuarios.forEach { println(it) }
    println("__________________________________")

    // Você pode adicionar
    usuarios.add(Usuario("Nami", false))
    usuarios.forEach{ println(it) }
    println("__________________________________")

    // Você pode excluir
    val novoUsuario = Usuario("Usopp", false)
    usuarios.add(novoUsuario)
    usuarios.forEach{ println(it) }
    println("__________________________________")
    usuarios.remove(novoUsuario)
    usuarios.forEach { println(it) }
    println("__________________________________")
    usuarios.removeAt(2) // Passa o índice do elemento que queremos remover
    usuarios.forEach { println(it) }
    println("__________________________________")

}