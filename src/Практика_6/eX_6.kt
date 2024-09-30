package Практика_6

fun main(){
    val array=mutableListOf<Int>()
    val array2=mutableListOf<Int>()
    println("Введите количесво чисел")
    val num= readln().toInt()
    for (i in 1..num){
        println("Введите число")
        var nam= readln().toInt()
        if (nam%2==0){
            array.add(nam)
        }
        else{
            array2.add(nam)
        }
    }
    println("Массив с четными ${array.joinToString()}")
    println("Массив с не четными ${array2.joinToString()}")
}