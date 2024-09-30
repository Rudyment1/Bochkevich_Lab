package Практика_6

fun main(){
    var array=mutableListOf<Int>()
    println("Введите количесво чисел")
    val num= readln().toInt()
    for (i in 1..num){
        println("Введите число")
        array.add(readln().toInt())
    }
    println(array.filter{ it %2==0}.sum())
}