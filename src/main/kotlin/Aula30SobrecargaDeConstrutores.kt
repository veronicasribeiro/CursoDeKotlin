fun main() {

    val usuarioA = UsuarioSobrecargaConstrutor("Luffy", true)
    println(usuarioA.nome)
    println(usuarioA.isAdmin)

    println()

    val usuarioB = UsuarioSobrecargaConstrutor("Zoro")
    println(usuarioB.nome)
    println(usuarioB.isAdmin)
}
                                        // Poderia ter um valor default aqui
class UsuarioSobrecargaConstrutor(var nome: String, var isAdmin: Boolean) {

    // Sobrecarga de construtor
    constructor(nome: String) : this(nome, false) {
        println("Executando o construtor 2...")
    }
}