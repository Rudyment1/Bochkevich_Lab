package Практика_4

fun main() {
    println("Введите группу крови (II, III, IV, I):")
    val blood = readLine()

    when (blood) {
        "II" -> println("II, I")
        "III" -> println("III, I")
        "IV" -> println("II, III, IV, I")
        "I" -> println("I (только I)")
        else -> println("Неизвестная группа крови. Пожалуйста, введите II, III, IV, I.")
    }
}