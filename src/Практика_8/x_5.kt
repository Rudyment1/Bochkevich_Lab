package Практика_8

fun main(){
    fun hundred(a:Int,b:Int):Boolean{
        return a+b<100
    }
    println("Введите 2 числа")
    var a= readln().toInt()
    var b= readln().toInt()
    println(hundred(a,b))
}