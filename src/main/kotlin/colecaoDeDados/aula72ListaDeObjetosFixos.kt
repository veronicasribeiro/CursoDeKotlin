package colecaoDeDados

import oop.Usuario


fun main() {

    val usuarios = arrayOf<Usuario?>(
        Usuario("Luffy", true),
        Usuario("Zoro", false)
    )

    // Funciona porque estou utilizando uma data class
    usuarios.forEach { println(it) }
    println("____________________________________")

    // Para adicionar novos elementos a lista, criamos uma variável nova e usamos o .plus
    val novaLista = usuarios.plus(Usuario("Nami", false))
    novaLista.forEach { println(it)}
    println("____________________________________")

    // Como acessar os elementos? Os elementos são acessados por índices
    println(usuarios[0])
    println("____________________________________")

    // Como atualizar a lista?
    usuarios[0] = Usuario("Novo Usuário", false)
    println(usuarios[0])
    println("____________________________________")

    // Como atualizar com o valor null? Precisa informar o valor nullable no array - arrayOf<Usuario?>
    usuarios[0] = null
    usuarios.forEach { println(it) }
}

