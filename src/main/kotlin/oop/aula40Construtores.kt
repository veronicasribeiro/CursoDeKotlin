package oop

fun main() {
    val login1 = Login("VeronicaRibeiro")
    println(login1.nome)

    val login2 = Login()
    println(login2.nome)

}


//class Login constructor(var nome: String = "") { }

class Login (var nome: String = "") {

}