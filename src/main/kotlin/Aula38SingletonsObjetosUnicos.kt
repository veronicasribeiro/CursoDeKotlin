fun main() {
    // OBJETOS UNICOS (Singleton) = Padrão único

    // classe -> é o molde para criar "N" objetos
    // objetos -> é o conjunto de propriedades e comportamentos de um contexto do seu sistema (botão, telaDeLogin...)
    // object -> é um objeto também, só que ele é único, ou seja, não é igual a class que sai vários objetos
    // (exemplo: Banco de dados, sessão de usuário, logs)

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

// Um único objeto vivo disponivel para o sistema inteiro
    // podemos usar para agrupar tudo que é constante no nosso programa
object BancoDeDados {
    var nome = "Desconhecido"
    // Se eu declarar que a variável será nula, eu tenho que botar "?"
    var usuarioLogado: UsuarioObjetos? = null
}

fun login(usuario: UsuarioObjetos) {
    BancoDeDados.usuarioLogado = usuario
}