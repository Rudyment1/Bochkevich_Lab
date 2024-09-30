package Практика_6

fun main(){
    val array=mutableListOf<Int>()
    println("Введите количесво чисел")
    val num= readln().toInt()
    println("Введите шаг")
    val n= readln().toInt()
    for (i in 0..num-1){
        array.add(i*n)
    }
    println(array)
}