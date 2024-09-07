fun main() {
    val produto: String = "Teclado"
    val preco: Double = 50.0
    val produto2: String = "phone"
    val preco2: Double = 1_001.0

    // O && verifica TODAS as expressões
    if (preco == 49.0 && produto == "Teclado") {
        println("Sucesso")
    } else {
        println("Falha")
    }

    // Se a primeira expressão do || for verdadeiro, ele não vai verificar as condições seguintes
    if (preco2 == 1_000.0 || produto2 == "Iphone") {
        println("Sucesso")
    } else {
        println("Falha")
    }
}