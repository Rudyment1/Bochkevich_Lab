package Практика_8

import kotlin.math.pow

fun main(){
    fun ysl(k:String,n:Int):Unit {
        print(k)
        if (n>0){
            ysl(k,n-1)
        }
    }

    println("Введите текст")
    var a= readln()
    println("Введите кол повторений")
    var b= readln().toInt()
    ysl(a,b-1)
}