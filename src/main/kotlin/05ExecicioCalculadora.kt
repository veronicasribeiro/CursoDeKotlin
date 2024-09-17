fun main() {

    val calculo1 = Calculadora(2.0,1.0)
    val soma = calculo1.adicionar()
    println("Resultado da soma: $soma")

    val calculo2 = Calculadora(1.0,5.0)
    val subtracao = calculo2.subtrair()
    println("Resultado da subtração: $subtracao")

    val calculo3 = Calculadora(5.0,5.0)
    val multiplicacao = calculo3.multiplicar()
    println("Resultado da multiplicação: $multiplicacao")

    val calculo4 =  Calculadora(4.0,2.0)
    val divisao = calculo4.dividir()
    println("Resultado da divisão: $divisao")


}

class Calculadora(var numero1: Double, var numero2: Double) {

    fun adicionar() : Double {
        return numero1 + numero2
    }

    fun subtrair() : Double {
        return  numero1 - numero2
    }

    fun multiplicar() : Double {
        return numero1 * numero2
    }

    fun dividir() : Double {
        return numero1 / numero2
    }

}

