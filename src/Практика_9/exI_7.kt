package Практика_9

import Практика_8.index

fun main(){
    println("Введите строку")
    var str= readln().toCharArray()
    for (i in str){
        if (i==i.lowercaseChar()){
            str[str.indexOf(i)]=i.uppercaseChar()
        }
        else if (i==i.uppercaseChar()){
            str[str.indexOf(i)]=i.lowercaseChar()
        }
    }
    println(str)
}