fun main() {
    // PROPRIEDADES E COMPORTAMENTOS DA CLASSE NÃO DO OBJETO!

    val userA = CompanionObject("Maria")
    val userB = CompanionObject("José")

    // essa função não pertence ao objeto, pertence à classe
    CompanionObject.resetarCount() // Tudo o que for de companion Object você pode acessar diretamente da classe

    val userC = CompanionObject("Mara")

}

class CompanionObject(var nome: String) {

    //var count = 0 // count do objeto (posso até declarar duas vezes porque são escopos diferentes

    // Tudo o que tá aqui dentro serão propriedades e comportamentoos da classe, não do objeto vivo e sim do model
    companion object { // Propriedades e comportamentos da CLASSE!!!!
        var count = 0 // pertence à classe não mais ao objeto que saira a partir dessa classe

        fun resetarCount() {
            count = 0
        }
    }

    init {
        count++
        println(count) // 1 para todos porque cada objeto tem sua propria propriedade
    }

}