package Практика_8

import kotlin.random.Random




fun main(){
    fun arrayadd(arrai:MutableList<Int>):Int{
        return arrai.max()-arrai.min()
    }
    println("Введите количество чисел N:")
    val n = readln().toInt()

    val numbers = mutableListOf<Int>()

    for (i in 1..n) {
        numbers.add(Random.nextInt(1,100))
    }

    println(arrayadd(numbers))
}