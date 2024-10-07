fun main() {
    // Classes abstratas não precisam definir somente comportamentos abstratos pode ter fixos/concretos também

    val flauta = Flauta54("Flauta X")
    flauta.afinar() // No comportamento abstrato cada um terá seu comportamento
    flauta.tocar() // No comportamento concreto todos terão o mesmo comportamento

    val guitarra = Guitarra54("Guitarra Y")
    guitarra.afinar()
    guitarra.tocar()
}

abstract class Instrumento54(var nome: String) {

    abstract fun afinar()

    fun tocar() {
        println("Tocando o instrumento $nome ")
    }
}

class Flauta54(nome: String) : Instrumento54(nome) {
    override fun afinar() {
        println("Afinando flauta em Sol...")
    }
}

class Guitarra54(nome: String) : Instrumento54(nome) {
    override fun afinar() {
        println("Afinando guitarra em Mi...")
    }
}