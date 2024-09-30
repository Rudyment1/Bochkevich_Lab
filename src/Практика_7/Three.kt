package Практика_7

fun main(){
    println("Введите так количесво побед количесво ничейных количесво проигрышей")
    val str= readln()
    println("Ваши очки состовляют${(str.split(" ")[0].toDouble()*3)+(str.split(" ")[1].toDouble()) }")
}