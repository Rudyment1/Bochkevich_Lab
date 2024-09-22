package Практиув_3
fun main(){
    val namb: MutableList<Int> = mutableListOf()
    println("Введите количесво пар")
    val kol= readln().toInt()
    for (i in 1..kol){
        for (a in 1..2) {
            println("Введите числа большее и меньшее")
            namb.add(readln().toInt())
        }
    }
    for (i in 0 until kol * 2 step 2){
        var maxi = namb[i]
        var mini = namb[i + 1]
        if (maxi < mini) {
            val temp = maxi
            maxi = mini
            mini = temp
        }
        if (maxi%mini==0){
            println("Эти числа:$maxi $mini деляться на друг друга без остатка и равны ${maxi/mini}")
        }
        else{
            println("Эти числа:$maxi $mini не деляться на друг друга без остатка и остаток равен ${maxi%mini}")
        }
    }
}