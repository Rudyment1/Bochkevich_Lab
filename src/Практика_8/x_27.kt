package Практика_8


fun main() {
    fun fin():MutableList<Int> {
        var n = readln().toInt()
        var arr = mutableListOf<Int>()
        for (i in 1..n) {
            arr.add(i)
        }
        return arr
    }
    println("Введите количесво чисел")
    println( fin())
}