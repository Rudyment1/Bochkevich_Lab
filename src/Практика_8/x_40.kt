package Практика_8

fun main() {
    fun vowels(str: String): Int  = str.filter { it in "аоуыэеёиюяАОУЫЭЕЁИЮЯ" }.length
    println("Введите строку: ")
    val str = readln()
    println("В строке ${vowels(str)} гласных")
}

