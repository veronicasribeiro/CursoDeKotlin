fun main() {
    // Herança - Fundamento Intermediário OOP
        // Um objeto pode herda propriedades e comportamentos de um outro objeto

    // POR QUE USAR HERANÇA? - Reutizar blocos de código mais facilmente

    val professor = Professor("Luffy", "Rua A")
    println(professor.descricao()) // Consigo acessar a descrição mesmo não estando dentro do professor

    val aluno = Aluno(123, "Maria", "Rua B")
    println(aluno.descricao())
}

// Herança -> objetoX é ObjetoY (herda as propriedades Y)

// Passo para a classe superior
// Super class
// TODA CLASSE CONVENCIONAL NÃO PODE TER HERANÇA!! - Mudo então para open - Agora pode ter herança
open class Pessoa(var nome: String, var endereco: String) {
    fun descricao() = "Meu nome é $nome e meu endereço é $endereco"
}

// declaro aqui! (não precisa do var)       // Da onde vem esse nome e endereço? vem da instância do professor
class Professor(nome: String, endereco: String) : Pessoa(nome, endereco)

class Aluno(var matricula: Int, nome: String, endereco: String) : Pessoa(nome, endereco)