/*
    Enunciado:
    Crie um programa em Kotlin que faça o seguinte:

    Declare uma variável mutável (var) que pode armazenar qualquer valor.
    Atribua um valor inicial à variável (pode ser um número, uma string, etc.).
    Use a funcionalidade ::class para descobrir o tipo da variável.
    Dependendo do tipo da variável:
    Se for String, imprima o texto em letras maiúsculas.
    Se for Int, multiplique o número por 2 e imprima o resultado.
    Se for Double, mostre o número com duas casas decimais.
    Se for qualquer outro tipo, imprima uma mensagem indicando que o tipo não é suportado.
* */

fun main() {

    var x = "MARIA"

    if (x is String) {
        println("A variável $x é do tipo: ${x::class}")
        println("A variável formatada para maiúsculo é: ${x.uppercase()}")
    } else if (x is Int) {
        println("A variável $x é do tipo: ${x::class}")
        println("O resultado da multiplicação $x X 2 é: ${x * 2}")
    } else if (x is Double) {
        println("A variável $x é do tipo: ${x::class}")
        val xFormatted = String.format("%.2f", x)
        println("Número formatado: $xFormatted")
    } else {
        println("Tipo não suportado")
    }

}

