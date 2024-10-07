package Практика_9

fun main(){
    println("Введите до какого числа вы хотите вывести простые числа")
    var n= readln().toInt()
    var mass= mutableListOf<Int>()
    for (i in 1..n){
        var index=0
        for (j in 1..n){
            if (i%j==0){
               index++
            }

        }
        if (index==2){
            mass.add(i)
        }
    }
    println(mass)
}