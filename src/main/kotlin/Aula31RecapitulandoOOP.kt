fun main() {

    // classes, objetos, construtor, função, propriedades (var, val, String, int, OutroObjeto)
    // comportamentos = ações - verbo tocar(), parar(), adiantar() - Funções
    // Propriedades = valores - var extenção: String = ".mp4"


    val usuario3 = UsuarioTeste("Maria", true)
    println(usuario3.nome)
    println(usuario3.isAdmin)
}

// Construtor Vazio

class UsuarioTeste(var nome: String, var isAdmin: Boolean) {

   constructor(nome: String) : this(nome, false) {
       println("Executando o construtor 2...")
   }

   constructor() : this("Desconhecido", false) {
       println("Executando o construtor 3...")
   }
}

// Calculadora - adicionar, subtrair, dividir, multiplicar
                                            // v2 -> Usuário