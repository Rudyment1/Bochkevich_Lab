package Практиув_3

fun main() {
    println("Введите число")
    val namb = readln().toInt()
    if (namb % 2 == 0) {
        if (namb % 10 == 7) {
            println("Ваше число четное и оканчивается на 7")
        } else {
            println("Ваше число четное и не оканчивается на 7")
        }
    } else {
        if (namb % 10 == 7) {
            println("Ваше число не четное и оканчивается на 7")
        } else {
            println("Ваше число не четное и не оканчивается на 7")
        }
    }
}