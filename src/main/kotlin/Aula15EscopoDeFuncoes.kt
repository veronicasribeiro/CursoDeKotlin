fun main() {
    println(oiMundo())
}

fun oiMundo() {
    println("Olá, Mundo!")

    fun subtracao() { // Essa função pertence somente ao escopo DESSA função oiMundo
        println("Uma mensagem para o usuário informando que começou a execução")
        println(4 - 2)
    }

    // Essa função será um bloco reutilizável somente para o escopo da função oiMundo
    subtracao()

    // fazer várias coisas (login, registro no banco...)

    subtracao()

    // FUNÇÕES INTERNAS (DE ESCOPO) SÃO MUITO RARAS DE USAR MAS É IMPORTANTE SABER QUE ELAS EXISTEM

}