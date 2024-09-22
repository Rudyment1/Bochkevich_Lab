package Практика_5

fun main() {
    println("Кубы чисел от 1 до 10:")

    for (i in 1..10) {
        val cube = i * i * i
        println("Куб $i = $cube")
    }
}