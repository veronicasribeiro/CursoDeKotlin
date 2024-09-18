fun main() {
    // INIT - Inicializa alguma coisa, inicializa sempre depois do construtor padrão
    // INIT É como um construtor (só que não tem parametros e não é comum ser visto) e é executado depois do construtor padrão
    val usuarioA = TesteInit()

}

class TesteInit(var nome: String, var isAdmin: Boolean) {

    // Sempre executado depois do construtor padrão
    init {
        println("Olá $nome")
    }

    // A ordem importa, é improvavel utilizar 2 init
    init {
        println("Olá 2")
    }

    constructor() : this("Desconhecido", false) {
        println("Executando construtor 2...")
    }

}