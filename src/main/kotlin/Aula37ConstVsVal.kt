fun main() {

}

class ConstVsVal() {

    // Aqui eu estou alocando uma constante em CADA objeto que sai
   // val MAX_NAME_LENGTH = 8 // propriedade que pertence ao objeto (preciso de um objeto vivo para acessar)

    companion object {
        // Aqui eu tenho uma constante
        // Val EXECUÇÃO (em tempo de execução) (é constante também)
        // AQUI eu estou alocando uma ÚNICA constante que é compartilhada em todos os objetos
        const val MAX_NAME_LENGTH = 8 // Constante em tempo de COMPILAÇÃO
    }
}