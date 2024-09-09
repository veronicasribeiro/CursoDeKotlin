fun main() {
    // functions - forma de reutilizar blocos de códigos para organização e manutenção

    olaMundo() // call

    // Uma série de códigos

    olaMundo()

    val precoDoProduto = 100.0
    val porcentagemDoDesconto = 101.0
    println("Preço do produto: $precoDoProduto")
    println("Porcentagem de desconto: $porcentagemDoDesconto")
    println("O preço final com desconto é: ${calcularDesconto(precoDoProduto, porcentagemDoDesconto)}")

}


/*
*   Exercício: Calculadora de Desconto
    Crie um programa que calcule o preço final de um produto após aplicar um desconto.
    O programa deve conter uma função que recebe o preço do produto e a porcentagem de
    desconto e retorna o preço final.

    Regras:
    Crie uma função chamada calcularDesconto que receba dois parâmetros: o preço original
    (do tipo Double) e a porcentagem de desconto (do tipo Double).
    A função deve retornar o preço final após o desconto.
    O desconto não pode ser maior que 100%. Se for, retorne o preço original sem aplicar o desconto.
    O programa deve pedir ao usuário o preço do produto e a porcentagem de desconto e exibir
    o valor final calculado pela função.
* */

fun calcularDesconto( precoDoProduto: Double, porcentagemDoDesconto: Double ) : Double {

    if (porcentagemDoDesconto > 100.0) {
        return precoDoProduto
    } else {
        val desconto: Double = precoDoProduto * (porcentagemDoDesconto / 100)
        val precoFinal: Double = precoDoProduto - desconto

        return precoFinal
    }
}















// fun
// nome da função
// Parâmetros
fun olaMundo() /* declaração */ { // corpo (body)
    println("Olá, Mundo!")
}