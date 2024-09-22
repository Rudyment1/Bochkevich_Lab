package Практика_4

fun main() {
    println("Введите число:")
    val numb = readln().toDouble()

    when {
        numb > 0 -> println("Число положительное")
        numb < 0 -> println("Число отрицательное")
        else -> println("Вы Ввели 0")
    }
}