package Практиув_3

fun main(){
    val namb: MutableList<Int> = mutableListOf()

    println("Введите количество чисел")
    val kol = readln().toInt()

    for (a in 1..kol){

        println("Введите числа")
        val na= readln().toInt()
        namb.add(na)
    }

    print("Все нечетные числа введеные вами ")

    for (i in namb){

        if (i%2!=0){
            print("$i ")
        }
    }
}