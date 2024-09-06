fun main() {
    val mediaDePreco: Int = 22
    println(mediaDePreco::class)

    // Eu quero imprimir para o usuário com a casa decimal...

    // CONVERTER O TIPO

    val mediaDePrecoConvertida = mediaDePreco.toDouble()

    println(mediaDePrecoConvertida)
    println(mediaDePrecoConvertida::class)

    /*
        Exercício:
        Crie um programa em Kotlin que faça o seguinte:

        Solicite ao usuário uma string que contenha um número inteiro.
        Converta essa string para inteiro e exiba o resultado.
        Converta o número inteiro em float e mostre o resultado.
        Converta o float em double e mostre o resultado.
        Converta o número inteiro em booleano (onde 0 é falso e qualquer outro número é verdadeiro)
        e mostre o resultado.
    * */

    println()
    println("EXERCÍCIO")
    var stringComUmNumeroInteiro: String = "456"
    val stringParaInteiro = stringComUmNumeroInteiro.toInt();
    println("STRING PARA INT: ${stringParaInteiro::class}")
    val inteiroParaFloat = stringParaInteiro.toFloat()
    println("INTEIRO PARA FLOAT: ${inteiroParaFloat::class}")
    val floatParaDouble = inteiroParaFloat.toDouble()
    println("FLOAT PARA DOUBLE: ${floatParaDouble::class}")

    var numeroInteiro: Int = 64885
    if (numeroInteiro == 0) {
        var inteiroParaBoolean: Boolean = false
        println("INTEIRO PARA BOOLEANO: $inteiroParaBoolean")
    } else {
        var inteiroParaBoolean: Boolean = true
        println("INTEIRO PARA BOOLEANO: $inteiroParaBoolean")
    }
 }