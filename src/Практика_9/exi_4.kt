package Практика_9

fun main(){
    println("Введите строку 1")
    var str1= readln().lowercase()
    println("Введите строку 2")
    var str2= readln().lowercase()
    if (str1.toCharArray().sorted()==str2.toCharArray().sorted()){
        println("Эти слова являются анаграммами")
    }
    else{
        println("Эти слова не являются анаграммами")
    }
}