fun main() {
    cadastroDeUsuario("Amy", 22)
    cadastroDeUsuario("José", 40)
    cadastroDeUsuario("Maria", 23)
    cadastroDeUsuario("Luffy", 19, isAdmin = true)
}

// Quero que meu sistema cadastre por padrão que o usuário cadastrado não é um admin
    // posso fazer isso com sobrecarga de funções
    // OU USAR VALORES PADRÕES = parâmetro default/ padrão (= false)
fun cadastroDeUsuario(nome: String, idade: Int, isAdmin: Boolean = false) {
    println("Usuário cadastrado com nome: $nome, idade: $idade, admin: $isAdmin")
}

//fun cadastroDeUsuario(nome: String, idade: Int) {
    //println("Usuário cadastrado com nome: $nome, idade: $idade, admin: true")
//}

