package tiposDeClasses

fun main() {
    val guitarra = Guitarra("verde")
    // Para chamar as propriedades do acordoamento foi preciso chamar com um ponto e = receber a classe Encordoamento()
        // Eu não quero que alguém pegue encordoamento e receba novas propriedades (quero restringir)
    guitarra.console()

}