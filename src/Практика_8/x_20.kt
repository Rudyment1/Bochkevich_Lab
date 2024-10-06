package Практика_8


fun main(){
    fun sort(arr: MutableList<Int>): MutableList<Int> {
        for (i in 0 until arr.size - 1) {
            for (j in 0 until arr.size - 1 - i) {
                if (arr[j] > arr[j + 1]) {

                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
        return arr
    }
    println("Введите количесво чисел")
    var n= readln().toInt()
    var arr= mutableListOf<Int>()
    for (i in 1..n){
        println("Введите число")
        arr.add(readln().toInt())
    }
    println( sort(arr))
}