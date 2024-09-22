fun main() {
    val namb: MutableList<Int> = mutableListOf()
    println("Введите количество чисел")
    val kol = readln().toInt()

    for (i in 1..kol) {
        println("Введите число")
        var na = readln().toInt()

        while (na in namb) {
            println("Введите другое число, это число уже введено")
            na = readln().toInt()
        }

        namb.add(na)
    }

    println("Сумма уникальных чисел: ${namb.sum()}")
}