fun main() {
    // Criptografia de dados - char


    val name: String = "Tiago" // string (uma sequência de caracteres (chras))
    val sobrenome: String = "Aguiar"
    val primeiraLetra: Char = 'T' // 16-bits
    val barraInvertidaPularLinha: Char = '\n' // Pular linha
    val barraInvertidaTab: Char= '\t' // TAB
    println(name + barraInvertidaPularLinha + sobrenome)
    println(name + barraInvertidaTab + sobrenome)
}