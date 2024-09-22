package Практика_5

fun main() {
    while (true) {
        println("Введите первую цифру:")
        val num1 = readln().toDouble()

        println("Введите вторую цифру:")
        val num2 = readln().toDouble()

        println("Выберите операцию: сложение (+) или умножение (*)")
        val operation = readln()

        when (operation) {
            "+" -> println("Результат сложения: ${num1 + num2}")
            "*" -> println("Результат умножения: ${num1 * num2}")
            "стоп" -> {
                println("Программа остановлена.")
                break
            }

            else -> println("Неправильная операция. Попробуйте снова.")
        }
    }
}