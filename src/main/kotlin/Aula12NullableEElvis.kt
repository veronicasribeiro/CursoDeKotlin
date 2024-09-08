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



}