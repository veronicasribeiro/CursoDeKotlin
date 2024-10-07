fun main() {
    /// 1. Função abstrata
    /// 2. Não existe necessidade da classe abstrata filha implementar o comportamento
    /// 3. Classes abstratas podem ter ou não funções abstratas
    /// 4. Como deixar o código mais flecível e fenérico possíbel com abstract class??
        // FAZER COM QUE A CLASSE PAI CONSIGA USAR O COMPORTAMENTO DA CLASSE FILHA PARA FAZER ALGUMA COISA

    val nicole = Musico55("Nicole Mitchell")
    val jonh = Musico55("Jonh Lennon")

    val violino = Violino55("Violino X")
    violino.tocar(nicole)

    val guitarra = Guitarra55("Guitarra X")
    guitarra.tocar(jonh)
}

class Musico55(val nome: String)

abstract class Instrumento55(var nome: String) {
    abstract fun afinar() : Boolean

    // O instrumento será tocado pelo músico então irei passar como parâmetro
    fun tocar(musico:Musico55) {
        // Se afinou eu posso tocar
        if (afinar()) {
                                            // Eu passei o músico como parâmetro para ele ser utilizado aqui!
            println("Tocando o... $nome por ${musico.nome}")
        } else {
            println("Por favor, ${musico.nome} afine o instrumento: $nome")
        }

    }
}

class Violino55(nome: String) : Instrumento55(nome) {
    override fun afinar() : Boolean { // Mudou lá, aqui também deve retornar um boolean
        println("Afinando o violino em dó")
        return true
    }
}

class Guitarra55(nome: String) : Instrumento55(nome) {
    override fun afinar(): Boolean {
        return false
    }
}