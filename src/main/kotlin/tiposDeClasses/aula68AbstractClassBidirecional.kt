package tiposDeClasses

fun main() {
    val flautista = Musico2("Nico Robin")
    val flauta = Flauta2("Flauta X")
    tocar(flauta,flautista)
    println("________________________\n")

    val guitarrista = Musico2("Roronoa Zoro ")
    val guitarra = Guitarra2("Guitarra Y", 6)
    tocar(guitarra,guitarrista)
    println("________________________\n")

    val violinista = Musico2("Vinsmoke Sanji")
    val violino = Violino2("Violino Z", 4)
    tocar(violino,violinista)
    println("________________________\n")
}

// Parâmetros de Super Class
// Como é uma classe abstrata eu tenho acesso aos métodos dela
fun tocar(instrumento:Instrumento2, musico: Musico2) {
    instrumento.tocar(musico)
}