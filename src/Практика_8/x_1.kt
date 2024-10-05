package Практика_8

fun main(){
    fun sum(i:Int,b:Int):Int{
        return i+b
    }
    println("Введите число")
    var a= readln().toInt()
    var i= readln().toInt()
    println(sum(a,i))
}