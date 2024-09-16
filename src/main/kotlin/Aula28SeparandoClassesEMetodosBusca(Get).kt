fun main() {
    val usuarioX = User("Luffy")
    // Armazenando a variável de retorno
    val usuarioLength = usuarioX.getNameLength()
    println(usuarioLength)

    val usuarioY = User("Gustavo")
    // Erro porque o constructor não tem mais valor padrão
    //usuarioY.nome = "Gustavo"
    println(usuarioY.getNameLength())
}