package Практика_8

fun main(){
    fun fin(arr:MutableList<Int>,fin:Int):String{
        if (arr.contains(fin))return("Ваше число есть в массиве") else return ("Ваше число есть нет в массиве")
    }
    println("Введите количесво чисел")
    var n= readln().toInt()
    var arr= mutableListOf<Int>()
    for (i in 1..n){
        println("Введите число")
        arr.add(readln().toInt())
    }
    println("Введите искаемое число")
    var find= readln().toInt()
    println( fin(arr,find))
}