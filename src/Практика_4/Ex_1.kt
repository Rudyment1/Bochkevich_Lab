package Практика_4

fun main(){
    println("Введите номер дня недели")
    var namb= readln().toInt()
    when(namb){
        1-> println("Понедельник")
        2-> println("Вторник")
        3-> println("Среда")
        4-> println("Четверг")
        5-> println("Пятница")
        6-> println("Суббота")
        7-> println("Воскресение")
    }
}