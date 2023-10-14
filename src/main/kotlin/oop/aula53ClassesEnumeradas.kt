package oop

fun main(){

    // Imprime a propriedade dessa bandeira
    println(CartaoDeCredito.VISA)

    println("_____")

    // Usar a propriedade .ordinal - Mostra a posição do indice
    println(CartaoDeCredito.MASTER.ordinal)

    println("_____")


    // Código que busca no servidor a bandeira baseada no nome do cartão
    val cartaoCreditoNomeAPI = "visa" // Esse "visa" veio do servidor

    // .valueOf - É uma propriedade embutida da enum class para atribuir um valor para a mesma
    // CartadoDeCredito recebe o valor que estará dento do cartaoCreditoNomeAPI
    // .uppercase adicionado porque não existirá um "visa" já que os valores atribuidos na classe são todos em maiúsculo
    // Guardando o valor em uma variável
    val cartao = (CartaoDeCredito.valueOf(cartaoCreditoNomeAPI.uppercase()))

    // Dar desconto para a pessoa que comprar usando VISA

    if (cartao == CartaoDeCredito.VISA) {
        println("Dar desconto")
    } else {
        println("Avisa que o cartão VISA tem desconto")
        // Você tem acesso as propriedades
        println("Você está usando o cartão ${cartao.label}")
    }

}

// Código de sistema de pagamento, cada pagamento é feito com um cartão de crédito

// Para declarar uma classe enumerada é preciso usar a palavra reservada enum class
// Declarando um contrutor você precisa chamar em cada elemento dentro da classe os contrutores
enum class CartaoDeCredito(val label: String) {
    VISA("Visa"),
    MASTER("Mastercard"),
    ELO("Elo"),
    AMEX("American Express")
}

// Posso checar que tipo de conta é e fazer alterações de acordo com cada tipo de conta
//enum class Perfil {
  //ADMIN,
  //USUARIO,
  //FUNCIONARIO
//}