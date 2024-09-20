fun main() {
    val produto1 = ProdutosLoja("iPhone", 1_000.0)
    produto1.exibirInformacoes()

}

class ProdutosLoja(val nome: String, private var preco: Double) {

    companion object {
        const val TAXA_FIXA_IMPOSTO = 0.10
    }

    private fun calcularPrecoFinal() : Double {
        val precoFinal = preco + (preco * TAXA_FIXA_IMPOSTO)
        return precoFinal
    }

    fun exibirInformacoes() {
        println("""
            Produto: $nome
            Preço original: R$%.2f
            Preço com imposto: R$%.2f
        """.trimIndent().format(preco, calcularPrecoFinal()))
    }
}