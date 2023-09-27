package introduction

fun main() {

    // TYPES
    val price = 29.90 // double
    val product = "iMac" // String
    val age = 22 // int
    val cpf = 5905098454879 // long
    val isAdmin = true // boolean
    val gender = 'F' // char
    val number = 12.30F
    // byte
    // short

    // Print the variable type
    println(price::class)
    println(product::class)
    println(age::class)
    println(cpf::class)
    println(isAdmin::class)
    println(gender::class)
    println(number::class)


    // SPECIFYING THE TYPE
    val name: String = "Luffy"
    println(name)


    // PRIMITIVE TYPE CONVERSION (.toTypeName)
    val numberInt = 22
    val conversionToDouble = numberInt.toDouble()
    println(numberInt)
    println(conversionToDouble)

}