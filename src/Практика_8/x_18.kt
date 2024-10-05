package Практика_8

fun main(){
    fun condi(arr:MutableList<Int>):Int{
        var suma=0
        for (i in arr.indices){
            suma+=arr[i]
        }
        return suma
    }
    println("Введите количесво чисел")
    var n= readln().toInt()
    var arr= mutableListOf<Int>()
    for (i in 1..n){
        println("Введите число")
        arr.add(readln().toInt())
    }
    println( condi(arr))
}