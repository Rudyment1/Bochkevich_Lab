package Практика_5

fun main() {
    println("Введите год:")
    val year = readln().toInt()

    println("Введите месяц (1-12):")
    val month = readln().toInt()

    println("Даты в $month месяце $year года:")

    var day = 1
    while (day <= 31) {
        if (month == 2) {
            val isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0
            val maxDays = if (isLeapYear) 29 else 28
            if (day <= maxDays) {
                println("$day.$month.$year")
            } else {
                break
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day <= 30) {
                println("$day.$month.$year")
            } else {
                break
            }
        } else {
            println("$day.$month.$year")
        }
        day++
    }
}