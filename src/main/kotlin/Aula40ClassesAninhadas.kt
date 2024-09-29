fun main() {
    // TIPOS DE CLASSES

    // 1. Classes aninhadas (Nasted Class)
    // 2.
    // 3.

    val madona = Musico()
    madona.descricao()

    // Passa o nome da classe pai e logo em seguida você pode acessar as classes associadas a elas
    val guitarra = Musico.Guitarra()
    guitarra.descricao()

    val saxofone = Musico.Saxofone()
    saxofone.descricao()
}

class Musico {
    var estilo: String = "Rock"
    fun descricao() = println("Meu estilo é $estilo")

   class Guitarra {
       var cordas = 6
       fun descricao() = println("Tocando uma guitarra com $cordas cordas")
   }

    class Saxofone {
        var familia = "Saxofone soprano"
        fun descricao() = println("Família: $familia")
    }
}