fun main() {
    verificacaoParaLogin(nome = "Luffy", idade = 23)
    verificacaoParaLogin(nome = "Zoro", idade = 23, isAdmin = false)
    verificacaoParaLogin(nome = "Sanji", idade = 23, isAdmin = true)

}

fun verificacaoParaLogin(nome: String, idade: Int, isAdmin: Boolean) {
    println("INTRUÇÃO 1: Meu nome é $nome, minha idade é $idade, sou admin? $isAdmin")
}

// Eu posso ter funções com o mesmo nome SE, E SOMENTE SE, os parâmetros forem diferentes
// O sistema só se importa com o tipo
fun verificacaoParaLogin(nome: String, idade: Int) {
    println("INTRUÇÃO 2: Meu nome é $nome, minha idade é $idade")
}