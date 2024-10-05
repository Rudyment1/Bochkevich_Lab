package Практика_8

fun main(){
    fun condi(first:Int):Int{
        var sum=1
        for (i in 1..first){
            sum*=i
        }
        return sum
    }
    println("Введите число")
    var first= readln().toInt()
    println( condi(first))
}