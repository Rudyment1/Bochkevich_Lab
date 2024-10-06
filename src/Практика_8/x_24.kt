package Практика_8

fun main(){
    println("Введите строку 1")
    var first= readln()
    println("Введите строку 2")
    var second= readln()
    fun addstr(first:String,second:String):String{
        return "$first $second"
    }
    println(addstr(first,second))
}