package Практика_5

fun main() {


    println("Введите N:")
    val n = readln().toInt()

    var sumEven = 0
    var sumOdd = 0

    for (i in 1..n) {
        if (i % 2 == 0) {
            sumEven += i
        } else {
            sumOdd += i
        }
    }

    println("Сумма четных чисел от 1 до $n: $sumEven")
    println("Сумма нечетных чисел от 1 до $n: $sumOdd")
}