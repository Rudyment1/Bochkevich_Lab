package Практика_8

import kotlin.random.Random

fun main(){
    fun cop(arr: Array<Int>): Array<Int> = arr.copyOf()
    val arr = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Массив: ${arr.joinToString()}")
    print("Копия массива: ${cop(arr).joinToString()}")
}

