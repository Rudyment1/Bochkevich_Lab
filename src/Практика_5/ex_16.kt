package Практика_5
fun main() {
    println("Введите N:")
    val N = readln().toInt()

    val sumOfSquares = N * (N + 1) * (2 * N + 1) / 6
    println("Сумма квадратов всех чисел от 1 до $N: $sumOfSquares")
}
