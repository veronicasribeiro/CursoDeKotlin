fun main() {
    val olaMundo = VisualizacaoTexto("Olá Mundo!")
    olaMundo.renderizar()

    val botaoLogin = VisualizacaoBotao("Entrar", "Verde")
    botaoLogin.renderizar()
}

// SE o texto tem - texto | corTexto
// Se o botao tem - texto | corTexto | corFundo
open class VisualizacaoTexto(var texto: String) {
    var corTexto = "#000"
    fun renderizar() {
        // código que desenha na tela
        println("Desenhando $texto na cor $corTexto")
    }
}

class VisualizacaoBotao(texto: String, var corFundo: String) : VisualizacaoTexto(texto) {

}