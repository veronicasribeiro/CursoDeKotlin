package tiposDeClasses

// Conceito intermediário do OOP
// Nível de Acesso
// protected var - Somente pai e filhos podem acessar
// private var - Somente a classe atual pode acessar as suas propriedades
// (nada) default - Qualquer um pode mudar essa var (que esteja no mesmo pacote)
fun main() {
    val professorA = Professor("Kakashi", "Rua A")
    println(professorA.descricao())

    val alunoA = Aluno(1234, "Naruto", "Rua B")
    println(alunoA.matriculaID)
    println(alunoA.nome)
    println(alunoA.descricao())

    /* Se eu não preciso da classe eu posso considerar ela uma classe abstrata, somente as filhas irão ter uma
    instância viva
     */
    //val pessoa = Pessoa("Maria", "Rua B")
}

// open class - A classe tradicional NÃO permite que se tenha herança, para isso usamos o OPEN CLASS
abstract class Pessoa(var nome: String, var endereco: String) {
    // protected - variável protegida para acesso somente para pai e filhos
    protected var acessoBiblioteca = false
    fun descricao() = "Meu nome é $nome e meu endereço é $endereco e meu acesso a biblioteca é: $acessoBiblioteca"
}

// instanciar Pessoa no "Professor(nome: String, endereco: String)"
class Professor(nome: String, endereco: String) : Pessoa(nome, endereco) {
    // Declarar construtor inicial (Init) para acessar a variável "acessoBiblioteca"
    init {
        acessoBiblioteca = true
    }

}
class Aluno(var matriculaID: Int, nome: String, endereco: String) : Pessoa(nome, endereco) {

}