package tiposDeClasses

fun main() {
    val guitarra = GuitarraTeste("Guitarra A")
    guitarra.afinar()

    val flauta = FlautaTeste("Flauta X")
    flauta.afinar()
}

// abstract class
/* 1.2 - Declarado uma classe abstrata para que todas as classes filhas definam por si só o comportamento, mesmo que a
assinatura seja a mesma
 */
abstract class InstrumentoTeste(nome: String) {

    // Não utiliza colchetes
    // abstract é usada antes do fun
    abstract fun afinar()
    // A assinatura da função é a mesma afinar() -> Abstrato
    // Só que o comportamento é diferente -> Concreto (Bloco de códigos)
}

class GuitarraTeste(nome: String) : InstrumentoTeste(nome) {

    // override - Referência para o abstract fun afinar() da classe super
    override  fun afinar() {
        println("Guitarra sendo afinada")
    }
}

class FlautaTeste(nome: String) : InstrumentoTeste(nome) {
    override fun afinar() {
        println("Flauta sendo afinada")
    }
}