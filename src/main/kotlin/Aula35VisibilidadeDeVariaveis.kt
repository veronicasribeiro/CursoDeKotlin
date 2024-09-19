fun main() {
    // VISIBILIDADE DAS SUAS VARIÁVEIS

    val usuarioA = VisibilidadeVariaveis("Maria")


    // Não permita que sua variável possa ser modificada
    // por hora, sempre declare suas variáveis como val
    //usuarioA.MAX_NAME_LENGTH = 16
}

class VisibilidadeVariaveis(var nome: String) {

    // Usar a variável apenas como leitura
    // Tudo o que for uma constante (imutável) você pode começar a escrever em letras maiúsculas
    // private - não quero que fique visível para fora da classe - somente dentro do objeto eu posso manipular ele
    private val MAX_NAME_LENGTH = 8 // padrão UPPER_CASE

    // SEMPRE use private, depois você vê se precisa dela fora

}