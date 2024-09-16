/*
    Exercício: Sistema de Conta Bancária
    Crie um sistema de Conta Bancária. Ele deve permitir que você crie contas,
    verificar saldos e realizar depósitos e saques.

    Requisitos:
    Classe ContaBancaria:

    Propriedades:
    numeroConta: o número da conta (somente leitura).
    titular: o nome do titular da conta.
    saldo: o saldo da conta (não pode ser alterado diretamente, só pelos métodos).

    Comportamentos:
    depositar(valor: Double): aumenta o saldo da conta.
    sacar(valor: Double): diminui o saldo da conta, desde que haja saldo suficiente.
    Metodo exibirSaldo(): exibe o saldo atual da conta.

    Métodos de alteração (set):
    Permita alterar o nome do titular da conta (titular).
*/


fun main() {

    val contaBancariaA = ContaBancaria("Verônica", 1_400.0)
    contaBancariaA.depositar(500.0)
    contaBancariaA.exibirSaldo()

    println()

    val contaBancariaB = ContaBancaria("Luffy", 1_500.0)
    contaBancariaB.sacar(500.0)
    contaBancariaB.exibirSaldo()

    println()

    contaBancariaB.novoTitular("Zoro")

}

class ContaBancaria(var titular: String, var saldo: Double) {

    fun depositar(valor: Double) {
        saldo = saldo + valor
        println("Depósito feito com Sucesso!")
    }

    fun sacar(saque: Double) {
        if (saldo >= saque) {
            saldo = saldo - saque
            println("Saque feito com Sucesso!")
        } else {
            println("Você não tem saldo suficiente!")
        }
    }

    fun exibirSaldo() {
        println("Seu saldo atual é: R$$saldo")
    }

    fun novoTitular(novoTitular: String) {
        titular = novoTitular
        println("""
            Novo titular atualizado com sucesso!
            Boas vindas, $titular"
        """.trimIndent())
    }
}