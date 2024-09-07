fun main() {
    val nome: String = "Tiago Aguiar" // OBJETO = tipo

    // Quantidade de caracteres dentro da nossa variável
    val tamanhoDoNome: Int = nome.length // PROPRIEDADE de um objeto (String)
    println(tamanhoDoNome)

    val nomeEmMaiusculo: String = nome.uppercase() // FUNÇÃO que muda o comportamento de um objeto (String)
    println(nomeEmMaiusculo)

    // Consigo usar o .length direto porque é uma propriedade da String
    println("Olá Pessoal".length)

}