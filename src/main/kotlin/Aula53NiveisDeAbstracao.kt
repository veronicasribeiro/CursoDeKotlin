fun main() {
     val violinoY = Violino53("Violino X")
    violinoY.afinar()
}

// class vó
abstract class Instrumento53(var nome: String) {
    abstract fun afinar()
}

// class mãe
abstract class InstrumentoDeCorda(nome: String, var cordas: Int) : Instrumento52(nome) {
    /*
        toda classe abstratada não é obrigada a implementar/definir o comportamento da assinatura
        da função abstrata

        Essa classe abstrata também pode ter filhos

        Somente a última classe da herança é obrigada a aplicar o comportamento

        POR QUE? Porque eu não irei instanciar essa classe, irei instanciar as classes filhas
     */
}

// class filha
class Guitarra53(nome: String) : InstrumentoDeCorda(nome, 6) {
    override fun afinar() {
        println("Afinando guitarra...")
    }
}

class Violino53(nome: String) : InstrumentoDeCorda(nome, 4) {
    override fun afinar() {
        println("Afinando violino...")
    }
}

class Flauta53(nome: String) : Instrumento52(nome) {
    override fun afinar() {
        println("Afinando flauta...")
    }
}