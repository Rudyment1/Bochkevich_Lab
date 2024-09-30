package Практика_6
import kotlin.random.Random
fun main(){
    val array=mutableListOf<Int>(Random.nextInt(0, 100))
    println("Введите количесво чисел")
    val num= readln().toInt()
    for (i in 1..num){
        array.add(Random.nextInt(0, 100))
    }
    println(array.joinToString())
    println("Введите число которое хотите найти")
    val nam= readln().toInt()
    println(array.contains(nam))
}