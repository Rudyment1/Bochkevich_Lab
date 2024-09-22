package Практика_5

fun main(){
    println("Введите число")
    val numb = readln()
    val len = numb.length
    var number = numb.toInt()
    var sum = 0

    for (i in 0 until len) {
        sum += number % 10
        number /= 10
    }

    println("Сумма цифр: $sum")
}
