/*
    Crie um programa em Kotlin que faça o seguinte:

    Declare uma variável imutável (val) para armazenar o nome de uma pessoa.
    Declare uma variável mutável (var) para armazenar a idade dessa pessoa.
    Mostre o nome e a idade da pessoa na tela.
    Depois, atualize a idade da pessoa com um novo valor e mostre novamente a idade na tela.
* */

fun main() {
    val name = "Verônica"
    var age = 23

    println("nome: $name")
    println("idade: $age")

    age = 24

    println("Nova idade...")
    println("idade: $age")
}

