package oop

fun main() {
    val cartao1 = CartaoCreditoCopiado(5982549, "05/24")
    val cartao2 = CartaoCreditoCopiado(8594495, "01/26")
    val usuarioA = UsuarioCopiado("Zoro", false, cartao1)
    // Copiando usuario A para o usuario B
    //val usuarioB = usuarioA.copy()
    //println(usuarioB)

    // Posso modificar prorpriedades da cópia
    val usuarioB = usuarioA.copy(isAdmin = true)
    println(usuarioB)
    println("_______________")

    // Utilidade aplicada
    // O mesmo usuário criou um segundo cartão

    // Foi aproveitado as propriedades passadas mas as propriedades do cartão foram alteradas
    val novoUsuarioA = usuarioA.copy(cartaoCredito = cartao2)
    println(novoUsuarioA)

}

data class CartaoCreditoCopiado(var numero: Int, var vencimento: String)
data class UsuarioCopiado(var nome: String, var isAdmin: Boolean, var cartaoCredito: CartaoCreditoCopiado)