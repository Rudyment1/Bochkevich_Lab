package Практика_2

import kotlin.math.pow

fun main(){
    println("Введите число")
    val namb= readln().toFloat()
    println("Введите степень")
    val step= readln().toFloat()
    println("Деление ваших чисел ${namb.pow(step)}")
}