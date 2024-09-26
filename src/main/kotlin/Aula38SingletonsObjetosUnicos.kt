fun main() {
    // OBJETOS UNICOS (Singleton) = Padrão único

    // A nossa classe consegue criar "n" objetos que a gente quiser
    val usuario1 = UsuarioObjetos("Maria")
    val usuario2 = UsuarioObjetos("João")
    val usuario3 = UsuarioObjetos("Mara")

    // Podemos declarar para que saia apenas um único objeto
    val usuarioObject1 = UsuarioObjetos("Maria")
    println(BancoDeDados.nome)
    println(BancoDeDados.usuarioLogado?.nome)

    login(usuarioObject1)

    println(BancoDeDados.usuarioLogado?.nome)

    val usuarioObject2 = UsuarioObjetos("Luffy")
    login(usuarioObject2)

    println(BancoDeDados.usuarioLogado?.nome)

}

class UsuarioObjetos(val nome: String) {

}

// Um único objeto vivo durante o codigo
object BancoDeDados {
    var nome = "Desconhecido"
    // Se eu declarar que a variável será nula, eu tenho que botar "?"
    var usuarioLogado: UsuarioObjetos? = null
}

fun login(usuario: UsuarioObjetos) {
    BancoDeDados.usuarioLogado = usuario
}