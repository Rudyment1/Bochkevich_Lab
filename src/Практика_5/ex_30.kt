package Практика_5

fun main() {

    println("Введите целое число:")
    val number = readln().toInt()

    val binary = number.toString(2)

    println("Двоичное представление числа $number: $binary")
}
