/*
    Exercício: Sistema de Cadastro de Produtos
    Você deve criar uma classe Produto que representa um produto em uma loja.
    A classe deve ter os seguintes requisitos:

    Atributos:

    nome: o nome do produto (String)
    preco: o preço do produto (Double)
    categoria: a categoria do produto (String)
    Construtores:

    Crie um construtor principal que receba os três parâmetros (nome, preco e categoria).
    Crie um construtor secundário que receba apenas o nome e preco, e defina a categoria como "Indefinida".
    Crie um construtor vazio que atribua os seguintes valores padrão:
    nome = "Produto desconhecido"
    preco = 0.0
    categoria = "Indefinida"
    Métodos:

    Crie um metodo exibirDetalhes() que imprime os detalhes do produto (nome, preço e categoria).
* */

fun main() {
    // Usando o construtor principal
    val produto1 = Produto("Iphone", 3_500.0, "Celular")
    produto1.exibirDetalhes()

    // Usando construtor secundário
    val produto2 = Produto("Máscara", 5.0)
    produto2.exibirDetalhes()

    // Usando construtor vazio
    val produto3 = Produto()
    produto3.exibirDetalhes()
}

class Produto(var nome: String, var preco: Double, var categoria: String) {

    constructor(nome: String, preco: Double) : this(nome, preco, categoria = "Indefinida")

    constructor() : this("Produto desconhecido", 0.0, "Indefinida")

    fun exibirDetalhes() {
        println("""
            
            DETALHES DO PRODUTO
            Nome: $nome
            Preço: R$%.2f
            Categoria: $categoria
        """.trimIndent().format(preco))
    }

}