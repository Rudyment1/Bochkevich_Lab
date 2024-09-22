package Практиув_3

fun main(){
    println("Введите Делимое")
    var del= readln().toInt()
    println("Введите Делитель")
    var deli= readln().toInt()
    if(deli!=0) {
        if (del % deli == 0) {
            println("Ваши числа деляться на цело и получается: ${del / deli}")
        } else {
            println("Ваши числа не деляться на цело")
        }
    }
    else{
        println("На 0 делить нельзя.")
    }
}