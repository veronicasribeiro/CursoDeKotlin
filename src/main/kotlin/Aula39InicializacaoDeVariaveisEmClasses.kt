fun main() {
    // 1. Inicializações de variáveis

    val usuario = Usuario39("Marcos")
    usuario.sobrenome = "Ribeiro"
    usuario.output()
}

class Usuario39(var nome: String) {

    // uma variável que será inicializada no futuro
    // lateinit não é aceitável em tipos primitivos
    lateinit var sobrenome: String

    fun output() = println("Meu nome é $nome $sobrenome")
}