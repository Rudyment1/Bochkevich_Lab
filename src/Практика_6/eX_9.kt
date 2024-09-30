package Практика_6

fun main(){
    var array=mutableListOf<Int>()
    var array2=mutableListOf<Int>()
    println("Введите количесво чисел")
    val num= readln().toInt()
    for (i in 1..num){
        println("Введите число")
        array.add(readln().toInt())
    }
    array2=array
    println(array2)
}