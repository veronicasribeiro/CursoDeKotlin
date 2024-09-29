/*
    Exercício: Gerenciamento de Configurações

    Descrição: Crie um sistema de gerenciamento de configurações de uma
    aplicação utilizando o padrão Singleton. As configurações incluem o
    nome da aplicação, a versão e o ambiente (desenvolvimento, produção, etc.).
    Esse gerenciador deve garantir que haja apenas uma instância durante toda a execução do programa.

    Requisitos:
    Crie uma classe ConfigManager que seja um singleton.
    A classe deve ter as seguintes propriedades:
    appName: Nome da aplicação (por padrão: "MyApp")
    version: Versão da aplicação (por padrão: "1.0")
    environment: Ambiente da aplicação (por padrão: "development")
    Implemente um metodo showConfig() que imprima as configurações atuais.
    Implemente métodos para alterar os valores dessas propriedades.
    Teste o singleton criando múltiplas referências e garantindo que elas se referem à mesma instância.
*/

fun main() {
    GerenciamentoDeConfiguracoes.mostrarConfiguracoes()

    GerenciamentoDeConfiguracoes.alterarConfiguracoes()
}

object GerenciamentoDeConfiguracoes {
    private var appNome = "MeuApp"
    private var versao = 1.0
    private var ambiente = "development"

    fun mostrarConfiguracoes() {
        println("""
            Configuração atual:
            Nome do App: $appNome
            Versão: $versao
            Ambiente: $ambiente
        """.trimIndent())
    }

    fun alterarConfiguracoes() {
        appNome = "TravelApp"
        versao = 2.0
        ambiente = "Produção"

        println("""
            
            Alterando configurações...
            Configuração atual:
            Nome do App: $appNome
            Versão: $versao
            Ambiente: $ambiente
        """.trimIndent())
    }
}