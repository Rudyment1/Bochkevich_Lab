package Практика_8

fun main(){
    fun condi(first:Int):Boolean{
        return first%2==0
    }
    println("Введите  число")
    var first= readln().toInt()
    println( condi(first))
}