package Практика_8

fun main(){
    println("Введите 2 числа")
    var first= readln().toInt()
    var second= readln().toInt()
    fun suma(first:Int,second:Int):Int{
        return first+second
    }
    println( suma(first,second))
}