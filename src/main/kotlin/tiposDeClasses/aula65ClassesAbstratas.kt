package tiposDeClasses

fun main() {
    val guitarra = GuitarraTeste("Guitarra A")
    guitarra.afinar()
    guitarra.descricao()

    val flauta = FlautaTeste("Flauta X")
    flauta.afinar()
    flauta.descricao()

    val violino = ViolinoTeste("Violino Y")
    violino.afinar()
    violino.descricao()
}

// abstract class
/* 1.2 - Declarado uma classe abstrata para que todas as classes filhas definam por si só o comportamento, mesmo que a
assinatura seja a mesma
 */
abstract class InstrumentoTeste(var nome: String) {

    // Não utiliza colchetes
    // abstract é usada antes do fun
    abstract fun afinar()
    // A assinatura da função é a mesma afinar() -> Abstrato
    // Só que o comportamento é diferente -> Concreto (Bloco de códigos)

    /* A classe abstrata não precisa só definir comportamentos abstratos, ela também pode definir comportamentos
    concretos
     */

    /*
    Fun - compartilhada em todas as classes filhas
    abstract fun - compartilhada em todas as classes filhas só que com um comportamento
    prorpio
     */
    fun descricao() {
        println("Esse é o intrumento: $nome")
    }
}

abstract class InstrumentoDeCordas(nome: String, var quantCordas: Int) : InstrumentoTeste(nome) {
    // Não é obrigado a IMPLEMENTAR/DEFINIR o comportamento da assinatura da fun abstract

    /*Toda classe abstrata não é obrigada a IMPLEMENTAR/DEFINIR o comportamento da assinatura da função abstract
    porque ela é abstrata, ela não precisa, somente o último da herança é obrigado a implementar porque é ela que
    você vai instanciar
     */

    /*
    EU VOU INSTANCIAR AS CLASSES FILHAS, LOGO EU VOU PRECISAR DEFINIR OS
    COMPORTAMENTOS QUE TODAS AS CLASSES PAI DEFINIU PARA ELA
     */
}

class GuitarraTeste(nome: String) : InstrumentoDeCordas(nome, 6) {

    // override - Referência para o abstract fun afinar() da classe super
    override  fun afinar() {
        println("Guitarra sendo afinada")
    }
}

class ViolinoTeste(nome: String) : InstrumentoDeCordas(nome, 4) {
    override fun afinar() {
        println("Violino sendo afinado")
    }
}

class FlautaTeste(nome: String) : InstrumentoTeste(nome) {
    override fun afinar() {
        println("Flauta sendo afinada")
    }
}