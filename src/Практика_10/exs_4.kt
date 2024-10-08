package Практика_10

fun main(){
    println("Введите количесво чисел")
    val num= readln().toInt()
    val array=mutableListOf<String>()
    for (i in 1..num){
        if (i%3!=0 && i%5!=0) {
            array.add(i.toString())
        }
        else if (i%3==0 && i%5!=0){
            array.add("Физллл")
        }
        else if (i%3!=0 && i%5==0){
            array.add("Бизлллл")
        }
        else if (i%3==0 && i%5==0){
            array.add(" ВизллБизлл.")
        }

    }
    println(array.joinToString())
}