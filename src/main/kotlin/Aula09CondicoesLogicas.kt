fun main() {
    // CONDIÇÕES (CONTROLE DE FLUXO)
    val produto: String = ""

    // Não aceitar produtos que tenham menos de três letras

    // ( <, <=, >, >=, !, ==, !=)
    if (produto.length < 3) {
        println("Cadastro inválido, você não pode cadastrar produtos com menos de 3 letras")
    } else {
        println("$produto cadastrado com sucesso!")
    }

    val preco: Double = 11_001.00
    if (preco > 30_000) {
        println("Você ganhou 30% de desconto")
    } else if (preco > 20_000) {
        println("Você ganhou 20% de desconto")
    } else if(preco > 10_000) {
        println("Você ganhou 10% de desconto")
    } else {
        println("Você não ganhou desconto!")
    }

    val idade: Int = 31
    // Posso imprimir em uma única linha se a condição for única
    if (idade > 30) println("Tenho mais de 30")
    else ("Teste")

    println("Terminou Programa")
}