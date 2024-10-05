package Практика_8

fun main(){
    fun condi(first:Int,second:Int):Int{
        return if (first>second) first else second
    }
    println("Введите 2 числа")
    var first= readln().toInt()
    var second= readln().toInt()
    println( condi(first,second))
}