package Практика_9

fun main(){
    fun sort(str:String):List<Char>{
        return  str.toCharArray().sorted()
    }
    println("Введите строку")
    var str= readln()
    println(sort(str))
}