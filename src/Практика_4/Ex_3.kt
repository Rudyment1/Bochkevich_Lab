package Практика_4

fun main() {
    println("Введите числовое значение (1-5:")
    val score = readln().toInt()

    when {
        score==5 -> println("Оценка: A")
        score==4 -> println("Оценка: B")
        score==3 -> println("Оценка: C")
        score==2 -> println("Оценка: D")
        score==1 -> println("Оценка: F")
        else -> println("Недопустимое значение. Введите число от 1 до 5.")
    }
}