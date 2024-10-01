/*
    Exemplo de Sistema de Pedidos em um Restaurante
    Você deve criar um sistema básico de pedidos de um restaurante.
    O sistema será composto pelas seguintes classes:

    Classes Enumeradas (Enums):
    Pratos: Enum que representa os pratos disponíveis no restaurante.
    Cada prato tem um nome e um preço.

    Exemplo de pratos: PIZZA(35.00), HAMBURGUER(25.00), SALADA(15.00).
    TamanhoBebida: Enum que representa o tamanho das bebidas. Cada tamanho
    tem uma descrição e um fator de multiplicação do preço.

    Exemplo: PEQUENO(1.0), MEDIO(1.5), GRANDE(2.0).

    Classe Pedido (Classe Externa):
    A classe Pedido vai representar um pedido do cliente. Nessa classe, será
    possível adicionar pratos e bebidas.

    Classe Interna Bebida (Classe Interna de Pedido):
    A classe Bebida estará dentro da classe Pedido. Ela será uma classe interna
    que permitirá adicionar uma bebida ao pedido, associando-a ao tamanho da bebida.

    Classe Aninhada GeradorDeRecibo (Classe Aninhada de Pedido):
    A classe GeradorDeRecibo estará aninhada dentro de Pedido e será responsável por
    calcular o valor total do pedido e imprimir um resumo do pedido (pratos e bebidas).

    Descrição do Funcionamento:
    O cliente pode criar um pedido.
    Ele pode adicionar pratos e bebidas de diferentes tamanhos.
    No final, o sistema gera um recibo com o valor total.
*/

// EM ANDAMENTO...

fun main() {

}

enum class Prato(val preco: Double) {
    PIZZA(35.00),
    HAMBURGUER(25.00),
    SALADA(15.00)
}

enum class TamanhoBebida(val tamanhoBebida: Double) {
    PEQUENO(1.0),
    MEDIO(1.5),
    GRANDE(2.0)
}

class Pedido(var prato: Prato) {

}