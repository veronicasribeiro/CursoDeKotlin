package tiposDeClasses

// Conceito intermediário do OOP
fun main() {
    val professorA = Professor("Kakashi", "Rua A")
    println(professorA.descricao())

    val alunoA = Aluno(1234, "Naruto", "Rua B")
    println(alunoA.matriculaID)
    println(alunoA.nome)
    println(alunoA.descricao())
}

// open class - A classe tradicional NÃO permite que se tenha herança, para isso usamos o OPEN CLASS
open class Pessoa(var nome: String, var endereco: String) {
    fun descricao() = "Meu nome é $nome e meu endereço é $endereco"
}

// instanciar Pessoa no "Professor(nome: String, endereco: String)"
class Professor(nome: String, endereco: String) : Pessoa(nome, endereco) {

}

class Aluno(var matriculaID: Int, nome: String, endereco: String) : Pessoa(nome, endereco) {

}