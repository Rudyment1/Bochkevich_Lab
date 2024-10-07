package Практика_9

import kotlin.random.Random

fun main(){
    println("Игра угадай число")
    val num=Random.nextInt(1,100)
    println("Введите число")
    fun qan(n:Int):Int{
        if (n>num){
            println("Ваше число больше загаданного числа")
        }
        else if (n<num){
            println("Ваше число меньше загаданного числа")
        }
        return n
    }
    var n= readln().toInt()
    qan(n)
    println(num)
    while (num != n){
        println("Введите число")
        n= readln().toInt()
        qan(n)
    }
    println("Вы угадали число")
}