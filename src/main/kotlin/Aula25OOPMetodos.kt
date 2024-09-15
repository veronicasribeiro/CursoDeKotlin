fun main() {

    // ctrl + b ou ctrl + q para acessar documentações
    val produto = "iMac"
    println(produto.uppercase())

    val idade = 31
    val resposta = idade.toDouble()
    println(resposta)

    val usuarioA = tranformarEmCaixaAlta("Apolo")
    println(usuarioA)
}

fun tranformarEmCaixaAlta(nome: String) : String {
    return nome.uppercase()
}