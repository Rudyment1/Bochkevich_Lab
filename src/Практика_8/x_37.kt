package Практика_8

fun main() {
    println("Введите строку: ")
    val str = readln()
    fun charCounter(str:String):Int=str.length
    println("Длина вашей строки: ${charCounter(str)}")
}