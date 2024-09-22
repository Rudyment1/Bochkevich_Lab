package Практиув_3

fun main(){
    val namb: MutableList<Int> = mutableListOf()
    for (i in 0..2){
        println("Введите длинну стороны")
        namb.add(readln().toInt())
    }
    if (namb[0] > namb[1]+namb[2] || namb[1] > namb[0]+namb[2] ||namb[2] > namb[0]+namb[1]){
        println("Ваш треугольник не сущесвует")
    }
    else{
        println("Ваш треугольник сущесвует")
    }
}