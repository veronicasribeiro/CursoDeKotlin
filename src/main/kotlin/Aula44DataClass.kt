fun main() {
    // Class
    // Inner Class
    // Nested Class
    // Enum Class
    // Data Class

    val usuario1 = UsuarioDataClass("Luffy")
    val usuario2 = UsuarioDataClass("Luffy")

    // Propriedades são iguais mas os objetos são  (class)
    println(usuario1)
    println(usuario2)
    println(usuario1 == usuario2) // Não estamos comparando conteúdo

    println(usuario1.nome == usuario2.nome)

    println(usuario1.descricao())
    println(usuario1.nomeLength())

    // 3 itens que o tornam uma classe especial
        // 1. ???
        // 2. ???
        // 3. ???
}

// data = dados | CLASSE DE DADOS =  O principal intuito é trabalhar com o conteúdo do objeto
data class UsuarioDataClass(val nome: String) {
    // var - propriedades
    // fun - comportamentos

    fun descricao(): String = "Meu nome é $nome"
    // Forma enxuta
    fun nomeLength() = nome.length
}

// DATA CLASS VS CLASS
// Data class = manipular estruturas de dados (manipular o conteúdo dos objetos)
