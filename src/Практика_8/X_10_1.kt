package Практика_8

fun main() {
    println("Введите выражение")
    val text = readln()

    val arr = text.split("").toMutableList()
    arr.removeAt(0)
    arr.removeAt(arr.size - 1)

    fun firster(arr: MutableList<String>): Unit {
        val number = mutableListOf<Double>()
        val first = mutableListOf<String>()
        val oper = mutableListOf<String>()

        for (i in arr) {
            if (i != "*" && i != "/" && i != "+" && i != "-") {
                first.add(i)
            } else {
                if (first.isNotEmpty()) {
                    number.add(first.joinToString("").toDouble())
                    first.clear()
                }
                oper.add(i)
            }
        }

        if (first.isNotEmpty()) {
            number.add(first.joinToString("").toDouble())
        }

        second(oper, number)
    }



    firster(arr)
}

fun second(oper: MutableList<String>, number: MutableList<Double>) {
    var result = number[0]
    for (index in oper.indices) {
        when (oper[index]) {
            "+" -> result += number[index + 1]
            "-" -> result -= number[index + 1]
            "*" -> result *= number[index + 1]
            "/" -> result /= number[index + 1]
        }
    }

    println("Результат: $result")
}