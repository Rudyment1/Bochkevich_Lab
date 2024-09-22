package Практика_5

fun main() {
    println("Таблица квадратов чисел от 1 до 20:")
    println("Число\tКвадрат")

    for (i in 1..20) {
        val sq = i * i
        println("$i\t$sq")
    }
}