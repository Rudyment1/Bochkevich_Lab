package Практика_8

fun main(){
    fun lasted(arr:MutableList<Int>):Int{
        return arr.last()
    }
    println("Введите количесво чисел")
    var n= readln().toInt()
    var arr= mutableListOf<Int>()
    for (i in 1..n){
        println("Введите число")
        arr.add(readln().toInt())
    }
    println( lasted(arr))
}