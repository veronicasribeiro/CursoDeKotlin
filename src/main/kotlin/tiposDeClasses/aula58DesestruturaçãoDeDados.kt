package tiposDeClasses

fun main() {
    val userA = UsuarioDesestruturado("Luffy", true)

    // Desestruturando dados
    val (nome, isAdmin) = userA
    println("Olá $nome, você é o capitão: $isAdmin")

    // A desestruturação ocorre por causa das funções ocultas
    println(userA.component1())
    println(userA.component2())
}

// A desestruturação só é possível quando utilizamos DATA CLASS
// A ordem declarada dos parâmetros dentro do data class é IMPORTANTE!
data class UsuarioDesestruturado(var nome: String, var isAdmin: Boolean)