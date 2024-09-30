package Практика_6

fun main() {


    println("Введите количество строк в матрице:")
    val rows = readln().toInt()

    println("Введите количество столбцов в матрице:")
    val cols = readln().toInt()

    val matrix = Array(rows) { Array(cols) { 0.0 } }

    println("Введите элементы матрицы:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("matrix[$i][$j] = ")
            matrix[i][j] = readln().toDouble()
        }
    }

    println("Оригинальная матрица:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${matrix[i][j]} ")
        }
        println()
    }

    val transposedMatrix = Array(cols) { Array(rows) { 0.0 } }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    println("Транспонированная матрица:")
    for (i in 0 until cols) {
        for (j in 0 until rows) {
            print("${transposedMatrix[i][j]} ")
        }
        println()
    }
}