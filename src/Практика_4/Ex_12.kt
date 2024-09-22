package Практика_4

fun main() {
    val errorMessage1 = "Ошибка сети"
    val errorMessage2 = "Ошибка сервера"
    val errorMessage3 = "Ошибка данных"
    val errorMessage4 = "Ошибка авторизации"
    val errorMessage5 = "Ошибка доступа"
    val errorMessage6 = "Ошибка времени выполнения"
    val errorMessage7 = "Ошибка подключения к базе данных"
    println("Введите код ошибки (100, 200, 300, 400, 500, 600, 700):")
    val input = readln().toInt()

    // Проверяем введённый код ошибки
    if (input != null) {
        when (input) {
            100 -> println(errorMessage1)
            200 -> println(errorMessage2)
            300 -> println(errorMessage3)
            400 -> println(errorMessage4)
            500 -> println(errorMessage5)
            600 -> println(errorMessage6)
            700 -> println(errorMessage7)
            else -> println("Неизвестный код ошибки")
        }
    } else {
        println("Неверный ввод!")
    }
}