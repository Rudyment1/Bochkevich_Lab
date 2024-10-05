package Практика_8

fun main(){
    fun hundred(a:Int):Boolean{
        return 100%a==0
    }
    println("Введите число")
    var a= readln().toInt()
    println(hundred(a))
}