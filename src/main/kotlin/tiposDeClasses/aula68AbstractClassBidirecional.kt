package tiposDeClasses

fun main() {
    val flautista = Musico2("Nico Robin")
    val flauta = Flauta2("Flauta X")
    flauta.tocar(flautista)
    println("________________________\n")

    val guitarrista = Musico2("Roronoa Zoro ")
    val guitarra = Guitarra2("Guitarra Y", 6)
    guitarra.tocar(guitarrista)
    println("________________________\n")

    val violinista = Musico2("Vinsmoke Sanji")
    val violino = Violino2("Violino Z", 4)
    violino.tocar(violinista)
    println("________________________\n")
}