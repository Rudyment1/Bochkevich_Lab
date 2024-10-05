package Практика_8

import kotlin.random.Random


fun main(){
    fun arrayonion(arr1:MutableList<Int>,arr2:MutableList<Int>):Set<Int>{
        return arr1.union(arr2)
    }
    println("Введите количество чисел N:")
    val n = readln().toInt()
    val numbers2 = mutableListOf<Int>()
    val numbers = mutableListOf<Int>()

    for (i in 1..n) {
        numbers.add(Random.nextInt(1,100))
        numbers2.add(Random.nextInt(1,100))
    }

    println(arrayonion(numbers,numbers2))
}