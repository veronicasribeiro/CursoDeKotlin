fun main() {
    val aluno1 = Aluno49("João")
    println(aluno1.descricao())

    val professor = Professor49("Julio")
    println(professor.descricao())
}

open class Pessoa49(var nome: String) {

    // protected -> somente as classes filhas poderão ter acesso (protegida)
    // private -> somente a classe atual pode acessar as propriedades
    // (nada) default -> qualquer um pode mudar essa var (que esteja no mesmo pacote)

    // Quem instanciar objeto não terá acesso MAS AS CLASSES FILHAS PODERÃO TER ACESSO!
    protected var acessoBiblioteca = false

    fun descricao() = "Meu nome é $nome. Nível de acesso: $acessoBiblioteca"

}

class Professor49(nome: String) : Pessoa49(nome) {
    init {
        acessoBiblioteca = true // private var - a classe filha não pode acessar essa propriedade
    }
}

class Aluno49(nome: String) : Pessoa49(nome)