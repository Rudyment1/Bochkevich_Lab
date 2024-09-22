package Практика_4

fun main() {
    println("Введите время в формате ЧЧ.ММ")
    val hour = readln().toFloat()

    when {
        hour in 0.0..5.6 -> println("Это ночь")
        hour in 6.0..11.6-> println("Это утро")
        hour in 12.0..17.6 -> println("Это день")
        hour in 18.0..23.6 -> println("Это вечер")
        else -> println("Неверный ввод. Пожалуйста, введите время от 00:00 до 23:59.")
    }
}