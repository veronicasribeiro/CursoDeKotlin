fun main() {
    verificacao(18, "Zoro")
    verificacao(17, "Luffy")
}

fun verificacao(idade: Int, nome: String) {
    println("Minha idade é $idade e meu nome é $nome")
    if (idade < 18) {
        println("$nome, você não pode dirigir")
    } else {
        println("$nome, você pode dirigir!")
    }
}