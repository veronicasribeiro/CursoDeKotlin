fun main() {
    // O QUE SÃO PARÂMETROS NOMEADOS??

    // Uma função passa argumentos e espera parâmetros

    // Se que quiser reorganizar os argumentos eu poso
                        // Argumentos
    verificacaoCapitao(nome = "Zoro", idade = 18, isCapitao = false) // reordenar
    verificacaoCapitao(17, "Luffy", true) // manter os parâmetros sem declarar os argumentos
    verificacaoCapitao(idade = 17, nome = "Nami", isCapitao = false) // manter os parâmetros (declarar argumentos)

}

// is = é;
// has = tem; exemplo: hasCertificacao
                        // Parâmetros
fun verificacaoCapitao(idade: Int, nome: String, isCapitao: Boolean) {
    println("Meu nome é $nome, tenho $idade anos, sou capitão? $isCapitao")
}