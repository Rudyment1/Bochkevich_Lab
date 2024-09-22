package Практика_5

fun main() {
    println("Введите начало диапазона:")
    val start = readln().toInt()

    println("Введите конец диапазона:")
    val end = readln().toInt()

    println("Простые числа в диапазоне [$start, $end]:")
    for (i in start..end) {
        if (i <= 1) continue
        var bol = true
        for (j in 2..Math.sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) {
                bol = false
                break
            }
        }
        if (bol) println(i)
    }
}
