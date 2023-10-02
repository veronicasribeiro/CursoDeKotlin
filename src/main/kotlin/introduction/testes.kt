package introduction

fun main() {
    val usuario1 = Usuario()

    usuario1.nome = "Luffy"
    usuario1.mensagemDeSaudacoes()

    usuario1.modificarNomeUsuario("Zoro")
    println(usuario1.nome)
}

class Usuario() {
    var nome: String = ""

    fun mensagemDeSaudacoes() {
        println("Olá $nome")
    }
    fun modificarNomeUsuario(novoNome: String) {
        nome = "Olá $novoNome (NOME ATUALIZADO)"
    }
}
