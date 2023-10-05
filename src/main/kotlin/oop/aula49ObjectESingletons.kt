package oop

fun main() {

    // Dessa forma você acessa diretamente pelo nome já que serve para TODO o projeto
    println(Constants.MAX_NAME_LENGTH)
    println(Constants.PHOTO_EXT)
    println(Constants.IMAGE_PATH)

}

object Constants {
    // ARMAZENAR TUDO QUE É CONSTANTE DENTRO DO SEU SISTEMA
    const val MAX_NAME_LENGTH = 8
    const val IMAGE_PATH = "/Imagens/"
    const val PHOTO_EXT = ".jpg"

}
