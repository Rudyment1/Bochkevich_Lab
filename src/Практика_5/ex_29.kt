package Практика_5

fun main() {

    println("Введите N:")
    val n = readln().toInt()

    var sum = 0.0

    for (i in 1..n) {
        sum += 1.0 / i
    }

    println("Сумма ряда 1, 1/2, 1/3, ..., 1/$n: $sum")
}