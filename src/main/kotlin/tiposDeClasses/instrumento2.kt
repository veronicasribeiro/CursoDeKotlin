package tiposDeClasses

class Musico2(var nome: String) {

}

abstract class Instrumento2(var nome: String) {
    abstract fun afinar() : Boolean

    // Tenho que fazer referência ao musico no tocar
        //para usar musico.nome
    fun tocar(musico:Musico2) {
        if (afinar()) {
            println("Tocando Instrumento: $nome pelo musico: ${musico.nome}")
        } else {
            println("Por favor, afine seu intrumento: $nome, ${musico.nome}")
        }
    }



}

abstract class InstrumentoDeCordas2(nome: String, var cordas: Int) : Instrumento2(nome) {

}
class Flauta2(nome: String) : Instrumento2(nome) {
    override fun afinar() : Boolean {
        println("Afinando Instrumento: $nome")
        return true
    }
}

class Guitarra2(nome: String, cordas: Int) : InstrumentoDeCordas2(nome, cordas) {
    override fun afinar() : Boolean {
        println("Afinando Instrumento: $nome, com $cordas cordas")
        return true
    }
}

class Violino2(nome: String, cordas: Int) : InstrumentoDeCordas2(nome, cordas) {
    override fun afinar() : Boolean {
        return false
    }
}