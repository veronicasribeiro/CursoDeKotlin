fun main() {
    val cartao1 = CartaoCredito46(123, "10/30")
    val cartao2 = CartaoCredito46(555, "12/10")
    val usuario1 = Usuario46("Luffy", false, cartao1)

    // Como fazer um cópia?
    // 1. Copiar tudo manualmente
    val usuario2 = Usuario46("", false, cartao1)
    usuario2.nome = usuario1.nome
    usuario2.isAdmin = usuario1.isAdmin
    usuario2.cartaoCredito = usuario1.cartaoCredito

    println(usuario1)
    println(usuario2)

    // 2. copy() - (posso alterar dados dentro desses parênteses embora seja uma cópia)
        // propriedade oculta dentro do DATA CLASS - classes tradicionais não tem copy()
    val usuario3 = usuario1.copy(isAdmin = true, cartaoCredito = cartao2)
    println(usuario3)


}

data class CartaoCredito46(val numero: Int, val expiracao: String) {

}

data class Usuario46(var nome: String, var isAdmin: Boolean, var cartaoCredito: CartaoCredito46) {

}