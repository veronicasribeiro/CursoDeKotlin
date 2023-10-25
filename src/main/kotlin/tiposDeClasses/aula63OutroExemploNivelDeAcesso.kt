package tiposDeClasses

fun main() {
    val olaMundo = EstiloView("Olá Mundo")
    olaMundo.renderizar()

    val botaoLogin = BotaoLogin("Entrar", "verde" )
    botaoLogin.renderizar()
}

// Botão e texto para tela

open class EstiloView(var texto: String) {
    protected var corTexto = "preto"
    fun renderizar() {
        // o código que desenha na tela
        println("Desenhando $texto na cor $corTexto")
    }
}

class BotaoLogin(texto: String, var corDeFundo: String) : EstiloView(texto) {

}