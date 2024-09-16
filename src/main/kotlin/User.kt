// constructor - inicializar o objeto
            // Especificar o nome aqui é redundante
class User constructor(var nome: String){

    fun getNameLength() : Int {
        return nome.length
    }
}

// OPÇÃO 1: sem valor padrão + palavra constructor explicita
// class User constructor(var name: String) {

// OPÇÃO 2: valor padrão
// class User(var name: String = "") {

// OPÇÃO 3: espera que a construção receba o valor (var)
// class User(var name: String)