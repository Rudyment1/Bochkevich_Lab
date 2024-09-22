package Практика_5
fun pros(num:Int):String{
    if (num < 2) return "Ваше число не является простым"

    // Проверяем делимость от 2 до num-1
    for (i in 2 until num) {
        if (num % i == 0) {
            return "Ваше число не является простым"
        }
    }
    return "Ваше число является простым"
}
fun main(){
    println("Введите число")
    var namb= readln().toInt()
    println(pros(namb))
}