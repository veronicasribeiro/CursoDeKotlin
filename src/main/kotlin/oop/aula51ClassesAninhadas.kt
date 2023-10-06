package oop

fun main() {
    val ritaLee = Musico()
    ritaLee.descricao()

    val guitarra = Musico.Guitarra()
    guitarra.descricao()

    val personalidade = Musico.Personalidade()
    personalidade.descricao()
}

class Musico {
    var estilo: String = "Rock"
    fun descricao() = println("Sou um músico de $estilo")

    class Guitarra {
        var cordas: Int = 6
        fun descricao() = println("Toco uma guitarra com $cordas cordas")
    }

    class Personalidade {
        var personalidade: String = "louca"
        fun descricao() = println("Dizem que sou $personalidade")
    }
}