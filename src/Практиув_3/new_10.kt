package Практиув_3

fun main() {
    println("Введите число a:")
    val a = readln().toInt()
    println("Введите число b:")
    val b = readln().toInt()

    if (a != 0) {
        if (b % a == 0) {
            println("$a является делителем числа $b.")
        } else {
            println("$a не является делителем числа $b.")
        }
    } else {
        println("На 0 делить нельзя.")
    }
}