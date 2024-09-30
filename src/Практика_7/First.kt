import kotlin.math.pow

fun main() {
    println("Введите выражение в формате: число оператор число (или введите 'exit' для выхода)")

    var str = readln()

    while (str != "exit") {
        val tokens = str.split(" ")

        if (tokens.size == 3) {
            val first = tokens[0].toDouble()
            val oper = tokens[1]
            val second = tokens[2].toDouble()

            if (first != null && second != null) {
                val result = when (oper) {
                    "+" -> first + second
                    "-" -> first - second
                    "*" -> first * second
                    "**" -> first.pow(second)
                    "/" -> if (second != 0.0) first / second else Double.NaN
                    "%" -> if (second != 0.0) first % second else Double.NaN
                    else -> null
                }

                if (result != null) {
                    if (result.isNaN()) {
                        println("Ошибка: Деление на ноль.")
                    } else {
                        println("Результат: $result")
                    }
                } else {
                    println("Ошибка: Неизвестный оператор: $oper")
                }
            } else {
                println("Ошибка: Некорректные числа.")
            }
        } else {
            println("Ошибка: Введите выражение в формате: число оператор число.")
        }

        println("Введите следующее выражение (или введите 'exit' для выхода):")
        str = readln()
    }

    println("Выход из калькулятора. До свидания!")
}
