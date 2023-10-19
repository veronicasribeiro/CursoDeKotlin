package condicoesLogicas

fun main() {
    val cartaoCreditoNomeAPI = "Master"
    val cartao = CartaoDeCredito.valueOf(cartaoCreditoNomeAPI.uppercase())

    // Retorno encurtado utilizando WHEN
    val desconto = when(cartao) {
        CartaoDeCredito.VISA -> "Desconto de 10%"
        CartaoDeCredito.MASTER -> "Desconto de 20%"
        else -> "Nenhum desconto aplicado!"
    }

    println(desconto + "\nRETORNO ENCURTADO UTILIZANDO WHEN")

    // Retorno encurtado utilizando IF
    val descontoIf = if (cartao == CartaoDeCredito.VISA) {
        "Desconto de 10%"
    } else if(cartao == CartaoDeCredito.MASTER){
        "Desconto de 20%"
    } else {
        "Nenhum desconto aplicado!"
    }

    println(descontoIf + "\nRETORNO ENCURTADO UTILIZANDO IF")

}

enum class CartaoDeCredito{
    VISA,
    MASTER,
    ELO,
    AMEX
}