package Практика_10


fun main(){
    val array=mutableListOf<Int>()
    println("Введите количесво чисел")
    val num= readln().toInt()
    for (i in 1..num){
        array.add(i)
    }
    println(array.reversed())
}