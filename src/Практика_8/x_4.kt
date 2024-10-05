package Практика_8

fun main(){
    fun ysl(prob:Int,prize:Int,pay:Int):Boolean{
        return ((prob*prize)>pay)
    }
    println("Введите 3 числа")
    var a= readln().toInt()
    var b= readln().toInt()
    var c= readln().toInt()
    println(ysl(a,b,c))
}