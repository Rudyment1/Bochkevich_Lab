package Практика_8

fun main() {
    println("Введите строку: ")
    val str = readln()
    fun deleteSpaces(str: String): String = str.replace(" ", "")
    println(deleteSpaces(str))

}
