fun main() {
    println(condicaoInline())
}

// body inline (função enxuta)
fun helloWord() = println("Olá Mundo!")

fun condicaoInline() {
    val idade = 20
    if (idade < 18) println("Não pode dirigir")
    else println("Pode dirigir")
}