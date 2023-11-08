package oop

data class Usuario(var nome: String, var isAdmin: Boolean) {

    fun caixaAlta() : String {
        return "Olá ${nome.uppercase()}"
    }

    fun atualizarNome(novoNome: String){
        nome = novoNome
        println("Olá ${nome.uppercase()} (ATUALIZADO COM SUCESSO)")
    }

    fun tamanhoCaracteres() : String {
        return "Seu usuário é $nome e tem ${nome.length} caracteres"
    }
}