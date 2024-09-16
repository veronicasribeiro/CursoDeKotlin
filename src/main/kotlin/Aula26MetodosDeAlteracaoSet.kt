fun main() {
    val usuario1 = UsuarioA()
    usuario1.nome = "Maria"

    println(usuario1.nome)
    usuario1.nomeUpperCase()

    usuario1.updateNome("José")

    println(usuario1.nome)
    usuario1.nomeUpperCase()


}

class UsuarioA() {
    var nome: String = ""

    fun nomeUpperCase() {
        println("Olá " + nome.uppercase())
    }

    fun updateNome(novoNome: String) {
        nome = "$novoNome: Atualizado com sucesso!"
    }

}