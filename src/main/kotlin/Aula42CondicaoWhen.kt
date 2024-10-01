fun main() {
    val usuario = UsuarioWhen("Bruce", false)

    /*if (usuario.nome == "Bruce") {
        println("Bruce encontrado no banco")
    } else if (usuario.nome == "Marcelo") {
        println("Marcelo está ao vivo")
    } else {
        println("Nenhum usuário encontrado no banco de dados")
    }
     */

    // WHEN - Quando (IF | ELSE | ELSE IF | ELSE)

    when(usuario.nome) {
        "Bruce" -> {
            println("É você Batman?")
        }
        "Marcelo" -> {
            println("Marcelo está ao vivo")
        }
        else -> println("Nenhum usuário encontrado no banco de dados")
    }

    /*if (usuario.nome == "Bruce") {
        println("Bruce encontrado no banco")
    } else {
        println("Nenhum usuário encontrado no banco de dados")
    }
     */

    // WHEN (IF | ELSE)
    when {
        usuario.nome == "Bruce" -> println("Olá, Batman!")
        else -> println("Nenhum Usuário encontrado")
    }
}

class UsuarioWhen(val nome: String, val isAdmin: Boolean) {

}