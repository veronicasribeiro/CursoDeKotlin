fun main() {
    // functions, escopo, fluxo if e else, retornos, tipos, manipulação de memória

    // Forma mais enxuta
    println("Resultado da soma é ${somar(2,3)}")
    println("Resultado da multiplicação é ${multiplicar(2.0,3.5)}")
}

fun somar(x: Int, y:Int): Int{
    return x + y
}

fun multiplicar(x: Double, y: Double): Double {
    return x * y
}

/* No android Studio primeiramente vamos ter que entender como desenha os elementos na tela
    (como fazer a interface gráfica) e depois aprendemos a usar a lógica de programação lá dentro
* */
