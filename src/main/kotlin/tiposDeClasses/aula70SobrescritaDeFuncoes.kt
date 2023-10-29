package tiposDeClasses

// Sisteminha de hierarquia criado
// Árvore de componentes de um dia a dia de um programador

fun main() {

    val btn = Btn("Salvar", "Verde", Pair(20,30))
    btn.render()
    println("\n")

    val link = Link("Saiba Mais", Pair(10,20))
    link.render()
}

abstract class Componentes {

    abstract fun posicao() : Pair<Int, Int>

    // Para sobrescrever precisar estar como open fun
    open fun render() {
        println("Desenhando nas posições: ${posicao().first} / ${posicao().second}")
    }
}
abstract class Texto(val texto: String) : Componentes(){
    override fun render() {
        super.render()
        println("Desenhando texto: $texto")
    }
}

class Btn(texto: String, val corDeFundo: String, val posicao: Pair<Int, Int>) : Texto(texto) {
    override fun posicao(): Pair<Int, Int> {
        return posicao
    }

    override fun render() {
        super.render()
        println("Desenhando na cor de fundo: $corDeFundo")
    }
}

class Link(texto: String, val posicao: Pair<Int, Int>) : Texto(texto) {
    override fun posicao(): Pair<Int, Int> {
        return posicao
    }
}