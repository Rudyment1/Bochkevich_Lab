package Практика_8

import kotlin.random.Random

fun main(){
    fun rev(arr: Array<Int>): List<Int> = arr.reversed()
    val arr = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Массив: ${arr.joinToString()}")
    print("Реверс: ${rev(arr)}")
}
