package Практика_6

import kotlin.random.Random
fun main(){
    val array=mutableListOf<Int>()
    var array2=mutableListOf<Int>()
    println("Введите количесво чисел")
    val num= readln().toInt()
    for (i in 1..num){
        array.add(Random.nextInt(1,100))
        array2.add(Random.nextInt(1,100))
    }
    println(array)
    println(array2)
    println(array.intersect(array2))
}
