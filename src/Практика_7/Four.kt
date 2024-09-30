package Практика_7

import kotlin.random.Random

fun main(){
    val array=mutableListOf<Int>()
    println("Введите количесво чисел")
    val num= readln().toInt()
    for (i in 1..num){
        println("Введите число")
        array.add(readln().toInt())
    }
    println(array.min())
}