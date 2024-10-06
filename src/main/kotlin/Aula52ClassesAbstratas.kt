fun main() {
    // ABSTRACT (Abstração) é o inverso de concreto - Você não tem uma ideia formada sobre aquilo
    /// 1.1 - Evitar instanciar a classe PAI (que não precisa de instancia)
    /// 1.2 -

    val professor = Professor("Nana", "Rua A")
    val aluno = Aluno(100, "Marcos", "Rua B")
    // Não tenho necessidade nenhuma de instanciar a classe Pessoa
    // EU NÃO PRECISO DO OBJETO, EU SÓ PRECISO DAS CLASSES FILHAS E DA ASSINATURA DA CLASSE MÃE/PAI
    val pessoa = Pessoa("Luffy", "Rua C") // Classe abstrata

    val flauta = Flauta52("Flauta X")
    flauta.afinar()

    val guitarra = Guitarra52("Guitarra X")
    guitarra.afinar()
}

abstract class Instrumento52(var nome: String) {
    // a assinatura da função é a mesma (afinar) -> abstrato
    // só que o comportamento de afinar é diferente -> concreto
    abstract fun afinar() // NÃO PODE TER { }
        // escrever o código que iria afinar o instrumento...
        // A ideia de comportamento é a mesma, mas a forma é diferente

}

class Guitarra52(nome: String) : Instrumento52(nome) {
    override fun afinar() {
        println("Afinação em E (Mi)")
    }
}

class Flauta52(nome: String) : Instrumento52(nome) {
    override fun afinar() {
        println("Afinação em C (Dó)")
    }
}