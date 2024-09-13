fun main() {
    //verificacaoParaLogin(nome = "Luffy", idade = 23)
    //verificacaoParaLogin(nome = "Zoro", idade = 23, isAdmin = false)
    //verificacaoParaLogin(nome = "Sanji", idade = 23, isAdmin = true)

    val raioDoCirculo = calcularArea(diametro = 12.0)
    println("A área do círculo é ${raioDoCirculo}cm")

    val areaDoRetangulo = calcularArea(largura = 4.0, altura = 7.0)
    println("A área do retângulo é ${areaDoRetangulo}m")

    val areaDoTriangulo = calcularArea(baseDoTriangulo = 6.0, alturaDoTriangulo = 4.0)
    println("A área do triângulo é ${areaDoTriangulo}")

    val areaDoQuadrado = calcularArea(ladoDoQuadrado = 5.0)
    println("A área do quadrado é ${areaDoQuadrado}")

}

fun verificacaoParaLogin(nome: String, idade: Int, isAdmin: Boolean) {
    println("INTRUÇÃO 1: Meu nome é $nome, minha idade é $idade, sou admin? $isAdmin")
}

// Eu posso ter funções com o mesmo nome SE, E SOMENTE SE, os parâmetros forem diferentes
// O sistema só se importa com o tipo
fun verificacaoParaLogin(nome: String, idade: Int) {
    println("INTRUÇÃO 2: Meu nome é $nome, minha idade é $idade")
}

/*
    Exercício: Calculadora de Área
    Crie várias funções chamadas calcularArea para calcular a área de
    diferentes formas geométricas. As funções devem ter o mesmo nome,
    mas com diferentes assinaturas (sobrecarga de funções), ou seja,
    diferentes parâmetros.

    As formas geométricas são:

    Círculo: A função recebe o raio.
    Retângulo: A função recebe a largura e a altura.
    Triângulo: A função recebe a base e a altura.
    Quadrado: A função recebe o lado.

    Requisitos:
    Utilize a sobrecarga de funções para definir múltiplas funções com o
    mesmo nome, mas com diferentes parâmetros.
    O nome das funções deve ser sempre calcularArea.
    A função deve calcular e retornar a área de acordo com os parâmetros fornecidos.
* */

fun calcularArea(diametro: Double, divisor: Int = 2):Double {
    val raio: Double = diametro / divisor
    return Math.PI * raio * raio
}

fun calcularArea(largura: Double, altura: Double):Double {
    return largura * altura
}

// Nome de funções iguais não conseguem receber parâmetros do mesmo tipo, na mesma quantidade
fun calcularArea(baseDoTriangulo: Double, alturaDoTriangulo: Double, divisor: Int = 2): Double {
    return baseDoTriangulo * alturaDoTriangulo / divisor
}

fun calcularArea(ladoDoQuadrado: Double): Double {
    return ladoDoQuadrado * ladoDoQuadrado
}