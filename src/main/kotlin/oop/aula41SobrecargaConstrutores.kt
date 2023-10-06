package oop

// SOBRECARGA DE CONSTRUTOR
fun main() {
    val user1 = User("veronicaRibeiro", true)
    println(user1.nome)
    println(user1.isAdmin)

    val user2 = User("reidospiratas")
    println(user2.nome)
    println(user2.isAdmin)
}

// 1. Usando valor default
//class User (var nome: String, var isAdmin: Boolean = false) { }

// 2. Usando um segundo construtor dentro da classe

// O user1 chama uma construtor com uma String e um Boolean (logo abaixo)
class User (var nome: String, var isAdmin: Boolean) {

    // O user2 só chamou o nome, como ele passou só uma String ele chamou o construtor 2 (logo abaixo)
    // Como ele chamou o contrutor abaixo eu preciso passar o valor do isAdmin (Boolean)
    // o this executa para o construtor principal
    // this(nome, false) - foi pego o nome e jogado para o principal, logo após passou automáticamente um falso
    // diretamente para o construtor principal
    constructor(nome: String) : this(nome, false) {
        println("Executei o construtor 2")
    }

    lateinit var sobrenome: String
    fun output() = println("Olá usuário $nome $sobrenome, você é admin: $isAdmin")
}