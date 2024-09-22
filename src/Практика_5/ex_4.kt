package Практика_5

fun main(){
    println("Введите число")
    val n= readln().toInt()
    var sam:Int=1
    for (i in 1..n){
        sam*=i
    }
    print(sam)
}