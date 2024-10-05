package Практика_8
import kotlin.math.pow
fun main(){
    fun ysl(k:Double,n:Double):Boolean{
        return k.pow(k)==n
    }
    println("Введите 1 число")
    var a= readln().toDouble()
    println("Введите 2 число")
    var b= readln().toDouble()
    println(ysl(a,b))
}