// Eu vou deixar como file e criar multiplas classes aqui dentro

// Eu não quero que essa propriedade seja acessível, quero restrição
// internal = fica disponível apenas para o file Intrumento.kt
internal class Encordoamento(val numeroDeCordas: Int, val marca: String)

// Eu quero associar a classe encordoamento a instrumento
open class Instrumento(var cor: String) {

    // Colocar como private se você coloca como internal e logo após criar uma função
    private lateinit var encordoamento: Encordoamento

    fun console() {
        println("Esse instrumento é da cor $cor e tem ${encordoamento.numeroDeCordas} cordas da marca ${encordoamento.marca}")
    }

    // Criando função para usar o encordoamento
    fun adicionarEncordoamento(numeroDeCordas: Int, marca: String) {
        // Como é uma variável privada eu tenho acesso a ela porque estou dentro da própria class
        encordoamento = Encordoamento(numeroDeCordas, marca)
    }
}

class Guitarra(cor: String) : Instrumento(cor) {
    init {
        adicionarEncordoamento(6, "NIG")
    }
}