fun main() {
    // OOP - Oriented Object Programing

    // DRY - Don't repeat Yourself (precisamos pensar em blocos reutilizáveis)

    // Tudo no mundo real pode ser levado para o mundo computacional que pode ser tratado como objeto

    // Tratar TUDO como obbjeto

    // carros, animais, cachorro, usuário, pessoa, RG, CPF, botão, campo de texto, validador de senha, banco de dados...

    // MOLDE (class) (TEMPLATE) - forma de modelo padrão
        // moldes precisam de propriedades (características)
        // class (molde responsável por criar N objetos (propriedades | comportamentos))
        // propriedades por propriedades sozinhas não são dinâmicas

    // instanciar = criar um objeto
    // objeto é a instancia (a criação) a partir daquele molde
    // uma vez modificado o molde, TODOS os objeto que saem dele vão receber as atualizações

    // objeto
    val usuarioA = Usuario()
    val usuarioB = Usuario()

    // variável + ponto (.) para acessar a propriedade
    usuarioA.nome = "Maria"
    usuarioB.nome = "Bruce"

    // variavel + ponto (.) + nome da propriedade para imprimir na tela
    println(usuarioA.nome)

    // Para acessar comportamentos:
    usuarioA.imprimirCaixaAlta()
    usuarioB.imprimirCaixaAlta()

}

// molde
class Usuario {
    var nome: String = "" // propriedade

    // responsabilidade

    fun imprimirCaixaAlta() { // comportamento
        println("Olá " + nome.uppercase())
    }
}
