fun main() {
    //1. \n
    val mensagem = "Olá, Verônica.\nSeu produto chegou!"
    println(mensagem)

    // 2. Aspas triplas (triple quotes)
    val bemVindo = """
        Olá Verônica.
        Seja bem vinda!
    """.trimIndent() // Vai tirar a identação
    println(bemVindo)

    // Exportação de dados em excel
    val csv = """
        texto1,
        texto2
    """.replaceIndent(";") // Pega a identação e troca pelo que eu colocar entre parênteses
    println(csv)

    // 3. $
    val nome = "Thiago"
    val idade = 31
    println("Olá " + nome + ", sua idade é: " + idade)

    println("Olá $nome, sua idade é: $idade")

    // podemos fazer expressões
    println("Sua idade + 10 é igual a: ${idade + 10} e seu nome tem ${nome.length} caracteres")
}