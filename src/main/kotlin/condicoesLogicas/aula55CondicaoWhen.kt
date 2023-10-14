package condicoesLogicas

import oop.Usuario

fun main() {
    val usuario = Usuario("Luffy", false)

    // When - Quando (Exemplo quando é IF / ELSE IF / ELSE
    // No Kotlin funciona como if e else
    when(usuario.nome) {
        "Luffy" -> {
            println("Luffy é o capitão dos chapéus de palha")
        }
        "Zoro" -> {
            println("Zoro é o imediato")
        }
        // Pode fazer a condição em line sem abrir o bloco de código quando há apenas um comando
        else -> println("${usuario.nome} pode sr parte da tripulação!")
    }

    // When - Quando (Exemplo quando é IF / ELSE
    // Usa o when direto com o bloco de código
    when {
        usuario.nome == "Luffy" -> println("Luffy é o capitão dos chapéus de palha")
        else -> println("${usuario.nome} pode sr parte da tripulação!")

    }

    /*
    CONDIÇÕES IF, ELSE IF E ELSE
    if (usuario.nome == "Luffy") {
        println("Luffy é o capitão dos chapéus de palha")
    } else if (usuario.nome == "Zoro") {
        println("Zoro é o imediato")
    } else {
        println("${usuario.nome} pode sr parte da tripulação!")
    }
    */
}