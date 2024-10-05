package Практика_8

fun main(){
    fun condi(arr:MutableList<Int>):Int{
        var maxi=arr[0]
        for (i in arr){
            if (i>maxi){
                maxi=i
            }
        }
        return maxi
    }
    println("Введите количесво чисел")
    var n= readln().toInt()
    var arr= mutableListOf<Int>()
    for (i in 1..n){
        println("Введите число")
        arr.add(readln().toInt())
    }
    println( condi(arr))
}