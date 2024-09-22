package Практика_5

fun main(){
    println("Введите до какого числа хотите число")
    var n= readln().toInt()
    var a = 0
    var b = 1
    val result:MutableList<Int> = mutableListOf()
    for (i in 0 until n) {
        result.add(a)
        val sum = a + b
        a = b
        b = sum
    }
    println(result.joinToString())
}