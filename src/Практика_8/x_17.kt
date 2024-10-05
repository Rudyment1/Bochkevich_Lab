package Практика_8

fun main(){
    fun condi(first:Int):Unit{
        var qan=0
        for (i in 1..first){
            if (first%i==0){
                qan++
            }
        }
        return if (qan==2) println("Ваше число простое") else println("Ваше число не простое")
    }
    println("Введите число")
    var first= readln().toInt()
    println( condi(first))
}