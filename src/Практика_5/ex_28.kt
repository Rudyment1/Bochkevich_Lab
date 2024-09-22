package Практика_5

fun main() {

    println("Введите количество чисел N:")
    val n = readln().toInt()

    val numbers = mutableListOf<Int>()

    println("Введите $n чисел:")
    for (i in 1..n) {
        val num = readln().toInt()
        numbers.add(num)
    }

    numbers.sort()

    println("Числа в порядке возрастания:")
    for (num in numbers) {
        println(num)
    }
}