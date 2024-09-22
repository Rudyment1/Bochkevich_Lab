package Практика_2

fun main(){
    println("Введите двухзначное число")
    var namb = readln().toInt()
    while (namb>100 || namb<9 ) {
        println("Введите двухзначное число")
        namb=readln().toInt()
    }
    val ten=namb/10
    val first=namb%10
    println("Число десятков $ten \nЧисло единиц $first \nСумма цифр ${ten+first} \nПроизведение цифр ${first*ten}")
}