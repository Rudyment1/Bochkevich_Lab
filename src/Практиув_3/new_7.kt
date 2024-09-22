package Практиув_3

fun main(){
    println("Введите первое число")
    var first= readln().toFloat()
    println("Введите второе число")
    var second= readln().toFloat()
    if (first>second){
        println("Первое число $first больше $second")
    }
    else if (first==second){
        println("Они равны")
    }
    else{
        println("Второе число $second больше $first")
    }
}