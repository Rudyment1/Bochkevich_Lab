package Практика_5
fun main() {
    println("Введите N:")
    val n = readln().toInt()

    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}
