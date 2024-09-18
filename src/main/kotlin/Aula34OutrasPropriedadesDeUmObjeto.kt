fun main() {
    // Todos os objetos são capazes de armazenar tipos de propriedades

    // PROPRIEDADE DE OBJETO
    val usuarioA = OutrasPropriedades("Maria", false)
    println(usuarioA.label)
    usuarioA.label = "Trocando o texto da label..."
    println(usuarioA.label)

}

class OutrasPropriedades(var nome: String, var isAdmin: Boolean) {

    // var - mutável
    // val - imutável
    // As classes podem ter algumas propriedades
    var label = "$nome é admin do sistema: $isAdmin"

    constructor() : this("Desconhecido", false)
}