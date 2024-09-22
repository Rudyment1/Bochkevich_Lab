package Практиув_3

fun main(){
    println("Введите 2 значное число")
    val namb= readln().toInt()
    if (namb>10 && namb<100){
        if (namb/10>namb%10){
            println("Цифра в Делятках больше чем Цифра в Единицах")
        }
        else if (namb/10<namb%10){
            println("Цифра в Делятках меньше чем Цифра в Единицах")
        }
        else{
            println("Цифры в Десятках и Единицах Равны")
        }
    }
    else{
        println("Вы ввели не двухзначное число")
    }
}