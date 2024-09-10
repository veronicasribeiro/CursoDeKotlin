fun main() {
    // Utilizando os parâmetros
    verificacaoDeIdade(31)

    verificacaoDeIdade(14)
}

// Posso criar quantos parâmetros eu quiser (função inline)
fun verificacaoDeIdade(idade: Int) = if (idade < 18) println("Não pode dirigir") else println("Pode dirigir")
