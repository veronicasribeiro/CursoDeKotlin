package oop

fun main() {
    val botaoSucesso = Botao()
    botaoSucesso.texto = "Sucesso"
    botaoSucesso.cor = "Verde"

    val botaoCancelamento = Botao()
    botaoCancelamento.texto = "Cancelado"
    botaoCancelamento.cor = "Vermelho"

    println(botaoSucesso.texto + '\n' + botaoSucesso.cor + '\n')
    println(botaoCancelamento.texto + '\n' + botaoCancelamento.cor)
}

class Botao() {
    var texto: String = ""
    var cor: String = ""
}