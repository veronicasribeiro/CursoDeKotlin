/*  Exercício: Sistema de Gerenciamento de Livros
    Implemente um sistema simples de gerenciamento de livros usando conceitos de
    propriedades (atributos) e comportamentos (métodos) em Kotlin.

    Requisitos:
    Crie uma classe Livro com as seguintes propriedades:

    titulo: String
    autor: String
    numeroDePaginas: Int
    lido: Boolean (inicialmente false)

    Adicione os seguintes comportamentos (métodos):

    lerLivro(): Define o valor de lido como true.
    informacoesDoLivro(): Retorna uma string formatada com o título, autor e número de páginas do livro.

    Crie uma classe Biblioteca que tenha uma lista de livros e os seguintes métodos:

    adicionarLivro(livro: Livro): Adiciona um livro à lista.
    listarLivros(): Exibe todos os livros da biblioteca com suas informações.
    listarLivrosLidos(): Exibe apenas os livros já lidos.

    Desafio extra:
    Crie um metodo removerLivro(titulo: String) que remove um livro da lista com base no título.
 */

fun main() {

    val livroA = Livro("Orgulho e Preconceito", "Jane Austen", 424)
    val informacoesDoLivro = livroA.informacoesDoLivro()
    println(informacoesDoLivro)

    println()

    livroA.lerLivro()

    println()


}

// Para declarar como acessíveis as variáveis precisam ser declaradas!
class Livro(var titulo: String, var autor: String, var numeroDePaginas: Int, var lido: Boolean = false) {

    fun lerLivro() {
        lido = true
        println("Parabéns! Você leu o livro: ${titulo}")
    }

    fun informacoesDoLivro() : String {
        return """
            Título: $titulo
            Autor: $autor
            Páginas: $numeroDePaginas
        """.trimIndent()
    }
}


// Essa parte eu não estudei ainda...

// Código da class biblioteca




