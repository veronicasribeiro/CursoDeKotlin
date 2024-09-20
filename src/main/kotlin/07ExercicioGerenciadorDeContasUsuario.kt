/*
    Crie uma classe Usuario que armazene informações sobre usuários,
    como nome e idade. Utilize um companion object para:

    Gerenciar um contador de usuários criados.
    Criar um metodo estático dentro do companion object que valide
    se a idade do usuário é válida (maior ou igual a 18 anos).
    Retornar a quantidade total de usuários criados.

    Requisitos:
    A classe Usuario deve ter um construtor que receba nome e idade.
    No companion object, inclua:
    Uma variável para contar o número total de usuários.
    Um metodo validarIdade que verifica se a idade passada é maior ou igual a 18.
    Um metodo totalUsuarios que retorna o número total de usuários criados.
* */

fun main() {
    val usuario1 = UsuarioExercicio("Maria", 18)
    val usuario2 = UsuarioExercicio("José", 17)
    val usuario3 = UsuarioExercicio("Luffy", 22)
    val usuario4 = UsuarioExercicio("Marta", 8)
    val usuario5 = UsuarioExercicio("Martinho", 100)
    val usuario6 = UsuarioExercicio("Marto", 100)

    println("Usuário válido: ${UsuarioExercicio.validarIdade(usuario1.idade)}")
    println("Usuário válido: ${UsuarioExercicio.validarIdade(usuario2.idade)}")
    println("Total de usuários criados: ${UsuarioExercicio.totalUsuarios()}" ) // quantas vezes o bloco init foi executado (quantos usuários)

}

class UsuarioExercicio(var nome: String, var idade: Int) {

    companion object {
        var contador = 0


                        // tenho que acessar a variável dentro desses parênteses
        fun validarIdade(idade: Int) : Boolean {
           return idade >= 18
        }

        fun totalUsuarios() : Int {
            return contador
        }
    }

    // o bloco init é executado sempre que você cria um novo usuário
    init {
        contador++ // adiciona 1 ao contador toda vez que um novo usuário é criado
    }
}

