fun main() {
    // TIPOS DE CLASSES

    // 1. Classes aninhadas (Nasted Class)
    // 2. Classes internas (Inner Class) - Aqui existe uma hierarquia
    // 3. Classes enumeradas (Enum)

    val madonna = Musico()
    madonna.descricao()

    // para acessar inner class eu preciso usar o objeto vivo (madonna.)
    val guitarra = madonna.Guitarra()
    guitarra.descricao()
    madonna.estilo = "MPB"
    guitarra.descricao()

    // Passa o nome da classe pai e logo em seguida você pode acessar as classes associadas a elas
    val saxofone = Musico.Saxofone()
    saxofone.descricao()

}

class Musico {
    var estilo: String = "Rock" // Propriedades de objetos
    fun descricao() = println("Meu estilo é $estilo")

    // inner = agora você terá acesso a variável "estilo" (acessar propriedades de uma classe superior)
   inner class Guitarra {
       var cordas = 6
       fun descricao() = println("Tocando uma guitarra com $cordas cordas, e o estilo de música é $estilo")
   }

    class Saxofone {
        var familia = "Saxofone soprano"
        fun descricao() = println("Família: $familia")
    }
}