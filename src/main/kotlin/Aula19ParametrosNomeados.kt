fun main() {
    // O QUE SÃO PARÂMETROS NOMEADOS??

    // Uma função passa argumentos e espera parâmetros

    // Se que quiser reorganizar os argumentos eu poso
                        // Argumentos
    verificacaoCapitao(nome = "Zoro", idade = 18, isCapitao = false) // reordenar
    verificacaoCapitao(17, "Luffy", true) // manter os parâmetros sem declarar os argumentos
    verificacaoCapitao(idade = 17, nome = "Nami", isCapitao = false) // manter os parâmetros (declarar argumentos)

    val salario1 = calcularSalario(salarioBase = 1400.00)
    println("Seu salário final é R$$salario1")

    val salario2 = calcularSalario(salarioBase = 1400.00, bonus = 250.0)
    println("Seu salário final é R$$salario2")

    val salario3 = calcularSalario(salarioBase = 1400.00, desconto = 400.00)
    println("Seu salário final é R$$salario3")

    val salario4 = calcularSalario(salarioBase = 1400.00, bonus = 700.00, desconto = 300.00)
    println("Seu salário final é R$$salario4")


}

// is = é;
// has = tem; exemplo: hasCertificacao
                        // Parâmetros
fun verificacaoCapitao(idade: Int, nome: String, isCapitao: Boolean) {
    println("Meu nome é $nome, tenho $idade anos, sou capitão? $isCapitao")
}

/*
    Exercício: Calculadora de Salários
    Crie uma função chamada calcularSalario que recebe três parâmetros:

    salarioBase (obrigatório): o salário base do funcionário.
    bonus (opcional, valor padrão 0.0): o bônus que o funcionário pode receber.
    descontos (opcional, valor padrão 0.0): o valor de descontos, como impostos ou outros encargos.
    A função deve calcular o salário final, aplicando o bônus e subtraindo os descontos.

    A função deve ser chamada com diferentes combinações de parâmetros, utilizando parâmetros
    nomeados para melhorar a legibilidade do código.

    Especificações:
    Se apenas o salário base for fornecido, o resultado será o próprio salário base.
    Se o bônus for fornecido, ele deve ser somado ao salário base.
    Se houver descontos, eles devem ser subtraídos do total (salário base + bônus).
* */

fun calcularSalario(salarioBase: Double, bonus: Double = 0.0, desconto: Double = 0.0): Double {
    return salarioBase + bonus - desconto
}