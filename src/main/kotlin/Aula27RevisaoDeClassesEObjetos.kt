fun main() {

    // OBJETO 1
    val botaoConfirmar = Botao()
    botaoConfirmar.texto = "CONFIRMAR"
    botaoConfirmar.cor = "verde"

    // OBJETO 2
    val botaoCancelar = Botao()
    botaoCancelar.texto = "CANCELAR"
    botaoCancelar.cor = "vermelho"

}

// MOLDE
class Botao() {
    // Um botão vermelho com o nome CANCELAR
    // Um botçao verde com o nome CONFIRMAR

    var texto: String = ""
    var cor: String = ""
}