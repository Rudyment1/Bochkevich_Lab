package Практика_8

fun main(){
    fun ysl(minu:Int,fps:Int):Int{
        return minu*fps
    }
    println("Введите кол минут")
    var minu= readln().toInt()*60
    println("Введите FPS")
    var fps= readln().toInt()
    println(ysl(minu,fps))
}