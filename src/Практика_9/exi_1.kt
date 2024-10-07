package Практика_9

import kotlin.random.Random

fun main(){
    println("Рандомные числа")
    for (i in 1..10){
        print("${Random.nextInt(1,100)} ")
    }
}