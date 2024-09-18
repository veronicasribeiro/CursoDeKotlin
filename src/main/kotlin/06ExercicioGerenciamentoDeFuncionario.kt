/*
    Exercício: Gerenciamento de Funcionários
    Crie uma classe chamada Funcionario que tem as seguintes propriedades:

    nome: String
    salario: Double
    horasTrabalhadas: Int
    A classe deve ter as seguintes funcionalidades:

    Uma propriedade chamada bonus, que retorna o valor de 10% do salário se o
    funcionário trabalhou mais de 40 horas. Caso contrário, retorna 0.

    Um metodo chamado exibirInformacoes() que imprime o nome do funcionário, o
    salário, as horas trabalhadas e o valor do bônus.

    Uma propriedade salarioTotal, que calcula o salário total do funcionário
    (salário + bônus).

    Requisitos:
    Todas as propriedades devem ser acessíveis, mas o bonus e o salarioTotal
    devem ser apenas de leitura (não modificáveis diretamente).

    Utilize um construtor para inicializar nome, salario e horasTrabalhadas.
* */

fun main() {

    val funcionario1 = Funcionario("Maria", 3_000.0, 45)
    funcionario1.exibirInformacoes()
}

class Funcionario(var nome: String, var salario: Double, var horasTrabalhadas: Int) {

    var bonus: Double = 0.0


    init {
        if (horasTrabalhadas > 40) {
            bonus = salario * 0.10
        } else {
            bonus = 0.0
        }
    }

    var salarioTotal: Double = salario + bonus

    fun exibirInformacoes() {
        println("""
            Funcionário: $nome
            Salário: R$%.2f
            Horas Trabalhadas: $horasTrabalhadas
            Bônus: R$%.2f
            Salário Total: R$%.2f
        """.trimIndent().format(salario, bonus, salarioTotal))
    }

}