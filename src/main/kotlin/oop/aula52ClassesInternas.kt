package oop

fun main() {
    val personagem = Personagem()
    personagem.descricao()
    // Instância criada com uma inner class
    val instrumento = personagem.Instrumento()
    instrumento.descricao()
}

class Personagem {
    var personagem: String = "Rita Lee"
    fun descricao() = println("Meu nome é ${personagem}, sou uma cantora de Rock")

     inner class Instrumento {
        var instrumento: String = "Guitarra"
        fun descricao() = println("Por ser $personagem, Toco uma $instrumento")
    }
}