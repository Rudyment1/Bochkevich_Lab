package Практика_8

fun main() {
    fun substring(str: String, substr: String): Boolean = str.contains(substr)
    println("Введите строку: ")
    val str = readln()
    println("Введите подстроку: ")
    val substr = readln()
    if (substring(str, substr)) println("Строка является подстрокой") else println("Строка не является подстрокой")
}
