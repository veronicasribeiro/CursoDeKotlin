package oop

// FORMAS DE INICIALIZAR UMA VARIÁVEL DENTRO DE UMA CLASSE
// 1. Variável imutável
// 2. Variável Nullable
// 3. Variável lateinit

fun main() {
    val userA = User("Luffy", true)
    userA.sobrenome = "D. Monkey"
    userA.output()

}