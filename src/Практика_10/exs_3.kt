package Практика_10

fun main() {
    println("Введите строку, которую нужно зашифровать")
    val str = readln()
    println("Введите шаг")
    val sh= readln().toInt()

    fun pass(str: String,sh:Int): String {
        val encryptedChars = str.map {
            (it.toInt() + sh).toChar()
        }
        return encryptedChars.joinToString("")
    }

    println(pass(str,sh))
}