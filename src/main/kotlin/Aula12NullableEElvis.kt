fun main() {
    // Se eu quiser declarar uma String com um valor null, eu tenho que colocar ?
        // aceita null (nullable)
    var produto: String? = "iMac"
    produto = "Iphone"
    produto = null

    println(produto)

    var endereco: String? = null

    // Ele só vai pegar a variável quando tiver algo escrito diferente de null
    // length é propriedade de uma String, se a string não existe então o length bão pode ser executado
    val quantidadeDeCaracteres = endereco?.length ?: 0 // operador elvis - como se fosse o else
    println(quantidadeDeCaracteres)

    /*
    *   Exercício: Verificação de Nome de Usuário

        Crie um programa que recebe um nome de usuário (do tipo String?), onde o valor
        pode ser nulo. Se o nome for nulo ou estiver vazio, o programa deve definir um
        valor padrão de "Usuário Desconhecido" e exibir uma mensagem de boas-vindas com
        esse nome. Caso contrário, exiba o nome fornecido.
    * */

    val nome: String? = null ?: "Usuário Desconhecido"
    val mensagem: String = "Boas vindas, $nome!"
    println(mensagem)

}