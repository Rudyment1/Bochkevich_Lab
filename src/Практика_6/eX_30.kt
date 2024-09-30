package Практика_6

import kotlin.random.Random

fun  main(){
    val array=mutableListOf<Int>()
    println("Введите количесво чисел")
    val num= readln().toInt()
    println("Введите количесво чисел для каждого массива")
    val n= readln().toInt()
    for (i in 1..num){
        array.add(Random.nextInt(1,100))
    }
    println(array.chunked(n))
}