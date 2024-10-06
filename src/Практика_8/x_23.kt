package Практика_8

fun main(){
    println("Введите текст")
    var text= readln()
    fun up(text:String):String{
        return text.uppercase()
    }
    println(up(text))
}