package tiposDeClasses

// CLASS X DATA CLASS
fun main() {
    val usuario1 = UsuarioDataClass("Thiago", false)
    val usuario2 = UsuarioDataClass("Thiago", false)

    // Retorna falso porque voccê estará comparando o objeto (class)
    //println(usuario1) // tiposDeClasses.UsuarioDataClass@b4c966a
    //println(usuario2) // tiposDeClasses.UsuarioDataClass@2f4d3709

    // Retorna verdadeiro porque você estará comparando o conteúdo em si (propriedades) (data class)
    println(usuario1 == usuario2)

    println(usuario1.boasVindas())

}

data class UsuarioDataClass(var nome: String, var isAdmin: Boolean) {

    fun boasVindas() = "Olá usuário $nome"

    // var -> propriedades
    // fun -> comportamentos
}