package Практика_8

fun main(){
    fun condi(first:String):Int{
        var b=0
        for (i in first){
            b++
        }
        return b
    }
    println("Введите строку")
    var first= readln()
    println( condi(first))
}