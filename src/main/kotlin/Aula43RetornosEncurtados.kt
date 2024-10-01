fun main() {
    val cartaoCreditoAPINome = "Master"
                                // valueOf - Converter para uma String
    val cartao = CartaoCredito.valueOf(cartaoCreditoAPINome.uppercase())

    //var desconto: String = ""

    /*
    // Armazenar em uma variável o retorno
    val desconto = if (cartao == CartaoCredito.VISA) {
        // vou passar direto a String aqui
        //desconto = "Desconto de 10%"
        "Desconto de 10%"
    } else if (cartao == CartaoCredito.MASTER) {
        "Desconto de 20%"
    } else {
        "Desconto não aplicado"
    }
     */

    // Armazenar em uma variável de retorno
    val desconto = when(cartao) {
        CartaoCredito.VISA -> {
            "Desconto de 10%"
        }
        CartaoCredito.MASTER -> {
            "Desconto de 20%"
        }
        else -> {
            "Desconto não aplicado"
        }
    }

    println(desconto)
}

