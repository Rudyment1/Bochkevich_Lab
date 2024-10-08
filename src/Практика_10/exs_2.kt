package Практика_10
fun generatePyramid(n: Int): List<String> {
    val pyramid = mutableListOf<String>()

    for (i in 1..n) {

        val spaces = " ".repeat(n - i)
        val hashes = "#".repeat(2 * i - 1)


        pyramid.add("$spaces$hashes$spaces")
    }

    return pyramid
}

fun main() {
    println("Введите количество уровней для пирамиды:")
    val n = readLine()?.toIntOrNull() ?: return
    val pyramid = generatePyramid(n)


    pyramid.forEach { println(it) }
}