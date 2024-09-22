package Практика_5

fun main() {
    println("Введите начальное число:")
    val snumber = readln().toInt()
    println("Введите шаг:")
    val step = readln().toInt()

    println("Введите количество элементов в последовательности:")
    val len = readln().toInt()

    println("Сгенерированная числовая последовательность:")
    for (i in 0 until len) {
        val number = snumber + i * step
        print("$number ")
    }
}