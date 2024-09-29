fun main() {
    // CLASSES ENUMERADAS (ENUM)

    println(CartaoCredito.VISA)
    println(CartaoCredito.MASTER)
    println(CartaoCredito.ELO)
    println(CartaoCredito.AMEX)

   // Ordinal = Propriedade (numerador)
    println(CartaoCredito.AMEX.ordinal)

    // Tem um código que busca em um servidor a bandeira baseado nos primeiros numeros
    val cartaoCreditoAPINome = "master" // "visa" veio do servidor

    // valueOf() - função embutida no enum              // uppercase para deixar o texto com caixa alta
    val cartao = CartaoCredito.valueOf(cartaoCreditoAPINome.uppercase())

    // Desconto para a pessoa que comprar usando visa
    if (cartao == CartaoCredito.VISA) {
        println("Dá um desconto")
    } else {
        println("Avisa ao usuário que o cartão VISA tem desconto!")
        // Usando o contrutor... Posso acessar as propriedades
        println("Você está usando o cartão ${cartao.label}, seu desconto é de ${cartao.percentualDeDesconto}")
    }


}

enum class CartaoCredito(val label: String, val percentualDeDesconto: Int) {
    /*
    val VISA = 1 // "visa"
    val MASTER = 2 // "mastercard"
    val ELO = 3 // "elo"
    * */

    // Agora eu tenho que passar o construtor aqui
    VISA("Visa", 40), // 0
    MASTER("Mastercard", 0), // 1
    ELO("Elo", 10), // 2
    AMEX("American Express", 0) // 3

}

enum class Perfil {
    ADMIN,
    CLIENTE,
    FUNCIONARIO
}