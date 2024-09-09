// Toda função main não tem retorno
fun main() {

    val resposta = somar() // call

    // Retorno Kotlin.Unit - Função não retorna nenhum valor, função então é marcada como Unit
    println(resposta)

    val resposta2 = subtrair()

    println(resposta2)

}

// Sem retorno
fun somar() {
    println(2 + 3)
}

// Como especificar o tipo de retorno
fun subtrair(): Int {
    return 3 - 2
}