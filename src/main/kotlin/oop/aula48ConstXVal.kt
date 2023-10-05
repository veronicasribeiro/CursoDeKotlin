package oop

// Const - COMPILAÇÃO
// Val - EXECUÇÃO
fun main() {

    println(Const.maxNomeLength("Luffy",true))
    println(Const.maxNomeLength("Zoro", false))
    println(Const.maxNomeLength("Sanji Perna de Pau", false))


}

class Const() {

    // Dessa forma você criaria uma constante para cada objeto:
    // val MAX_NOME_LENGTH = 8

    // Dessa forma você cria APENAS uma constante para os objetos
    companion object {
       private const val MAX_NOME_LENGTH = 8

        fun maxNomeLength(nome: String, isAdmin: Boolean) : String{
            if (nome.length > MAX_NOME_LENGTH) {
                println("Nome Inválido")
            } else {
                println("Olá $nome")
            }

            return "Administrador: $isAdmin"
        }
    }

}