package Практиув_3

fun main(){
    println("Введите количесво чисел")
    val namb= readln().toInt()
    var maxx=0
    for (i in 1..namb) {
        println("Введите число")
        var chs= readln().toInt()
        if (chs>maxx){
            maxx=chs
        }
    }
    println(maxx)
}