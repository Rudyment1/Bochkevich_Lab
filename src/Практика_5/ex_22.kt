package Практика_5
import kotlin.random.Random
fun main() {
    val numb = Random.nextInt(1, 101)
    var kol = 0
    println("Угадай число")

    while (true) {
        println("Введите число:")
        val num = readln().toInt()
        kol++

        if (num == numb) {
            println("Поздравляем! Вы угадали число с $kol попытки.")
            break
        } else {
            println("Вы не угадали. Попробуйте снова.")
        }
    }
}