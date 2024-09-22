package Практика_5

fun main() {
    println("Введите первую строку:")
    val firstString = readln()

    println("Введите вторую строку:")
    val secondString = readln()

    val sortedFirst = firstString.toCharArray().sorted()
    val sortedSecond = secondString.toCharArray().sorted()

    if (sortedFirst == sortedSecond) {
        println("Строки являются анаграммами.")
    } else {
        println("Строки не являются анаграммами.")
    }
}