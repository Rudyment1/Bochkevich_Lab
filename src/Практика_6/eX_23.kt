package Практика_6
import kotlin.random.Random

//fun addArray(size: Int): List<Int> {
//    return List(size) { Random.nextInt(1, 100) }
//}
//
//fun main() {
//    println("Введите количество массивов:")
//    val arrayCount = readln().toInt()
//
//    println("Введите количество чисел в массивах:")
//    val numbersInArray = readln().toInt()
//
//    val array = List(arrayCount) { addArray(numbersInArray) }
//
//    println(array)
//}


fun addArray(num: Int, array: MutableList<Int>) {
    for (i in 1..num) {
        array.add(Random.nextInt(1, 100))
    }
}

fun main() {
    val array = mutableListOf<MutableList<Int>>()
    println("Введите количество массивов")
    val arr = readln().toInt()
    println("Введите количество чисел в массивах")
    val num = readln().toInt()

    for (i in 1..arr) {
        val innerArray = mutableListOf<Int>()
        addArray(num, innerArray)
        array.add(innerArray)
    }

    println(array)
}