package oop

fun main() {
    // Modificadores de Visibilidade
    // private: Apenas para classes
    // public: Em todos os lugares (fora dos módulos também)
    // protected: Somente dentro das subclasses (SubClasse : ClasseSuper)
    // internal: Em todos os lugares (mas não fora dos módulos)
}

open class MyDemon {
    public var a = "Public"
    private var b = "Private"
    protected var c = "protected"
    internal var d = "internal"
}

class MyClass {
    fun test() {
        var meuObj = MyDemon()
        println (meuObj.a) // Public
        // Private
        // Protected
        println(meuObj.d) // internal
    }
}