package tiposDeClasses

// Para restringir somente para dentro do módulo, usamos a propriedade privada INTERNAL
    // Qualquer um que quiser acessar o Encordoamento de fora, ele não vai deixar, o erro aponta na classe super
    // A ideia é restringir a estrutura do seu código para pessoas de fora não conseguirem modificar o comportamento
internal class Encordoamento(var numeroDeCordas: Int, var marca: String)
open class Instrumento(var cor: String) {

    // Ter acesso a propriedade que é o encordoamento
        // Objeto pode ter referência para outro objeto
    private lateinit var encordoamento: Encordoamento
    fun console() {
        println("Esse instrumento tem a cor $cor, tem o encordoamento de ${encordoamento.numeroDeCordas} cordas" +
                " e a marca é ${encordoamento.marca}")
    }

    /* A classe acordoamento está sendo administrada somente pela classe super, nunguém de fora, mesmo por herança
    não tem acesso
     */
    fun addEncordoamento(num: Int, marca: String) {
        encordoamento = Encordoamento(num, marca)
    }
}

// Herdou todas as propriedades da classe superior
class Guitarra(cor: String) : Instrumento(cor) {
    init {
        addEncordoamento(6, "Yamaha")
    }
}