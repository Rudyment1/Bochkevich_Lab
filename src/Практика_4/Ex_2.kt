package Практика_4

fun main(){
    println("Введите 3 стороны")
    var first= readln().toInt()
    var second= readln().toInt()
    var three= readln().toInt()
    when {
        first==second && second==three-> println("Ваш треугольник равностороний")
        first==second || second==three || first==three-> println("Ваш треугольник равнобедренный")
        else -> println("Ваш треугольник разносторонний")
    }
}