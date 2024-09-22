package Практика_5

fun main() {
    println("Введите строку:")
    val str= readln()
    if (str == str.reversed()) {
        println("Строка является палиндромом.")
    } else {
        println("Строка не является палиндромом.")
    }
}