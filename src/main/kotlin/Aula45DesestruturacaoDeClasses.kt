fun main() {

    // Como fazer isso de outra maneira?? DESESTRUTURAÇÃO (Data class)
    val usuario1 = UsuarioDataClass("Zoro", "Ronoroa")
    println("Usuário logado é: ${usuario1.nome}")

    // ISSO É UMA DESESTRUTURAÇÃO! // A ordem importa! - Pega os erros de compilação!
    val (nome,sobrenome) = usuario1 // Ele acessa a propriedade na sequência em que foi criado
    println("Meu nome é $nome $sobrenome")

    // FUNÇÕES OCULTAS - A desestruturação só funciona porque existe o component
    usuario1.component1() // nome
    usuario1.component2() // sobrenome
    // Cada vez que você gera uma variável nova um novo component é criado

}