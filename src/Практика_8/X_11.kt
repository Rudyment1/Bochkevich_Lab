package Практика_8

fun main() {
    println("Введите количесво о")
    var quantity = readln().toInt()
    fun addo(quantity:Int):String{
        var text="G"

        for (i in 1..quantity) {
            text += "o"
        }
        text+=("gle")
        return text
    }
    println( addo(quantity))
}
