package oop

fun main() {
    val usuarioTeste1 = UsuarioTeste()
    usuarioTeste1.mensagemSaudacao()

    val calculadora = Calculadora()
    println("SOMA: ${calculadora.somar(5.0,5.0)}")
    println("SUBTRAÇÃO: ${calculadora.subtrair(5.0,2.0)}")
    println("MULTIPLICAÇÃO: ${calculadora.multiplicar(5.0, 2.0)}")
    println("DIVISÃO: ${calculadora.dividir(10.0,2.0)}")


}

class Calculadora() {
    fun somar(x: Double, y: Double) : Double{
        return x + y
    }
    fun subtrair(x: Double, y: Double) : Double{
        return x - y
    }
    fun multiplicar(x: Double, y: Double) : Double{
        return x * y
    }
    fun dividir(x: Double, y: Double) : Double{
        return x / y
    }


}

class UsuarioTeste(var nome: String, var isdAdmin: Boolean) {

    constructor(nome: String) : this(nome, false)

    constructor() : this("Desconhecido", false)
    fun mensagemSaudacao() {
        if (isdAdmin == false) {
            println("Olá usuário ${nome.uppercase()}, você não é um administrador")
        } else {
            println("Olá administrador ${nome.uppercase()}")
        }
    }

}