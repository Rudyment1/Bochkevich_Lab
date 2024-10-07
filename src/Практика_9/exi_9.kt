package Практика_9

import kotlin.random.Random

fun main(){
    println("Введите длинну пароля")
    var n= readln().toInt()
    var mass= mutableListOf<String>()
    val characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    val specialCharacters = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~"
    for (i in 1..n){
        var v=Random.nextInt(1,4)
        if(v==1){
            mass.add(Random.nextInt(1,10).toString())
        }
        else if (v==2){
            mass.add(characters[Random.nextInt(0,62)].toString())
        }
        else if (v==3){
            mass.add(specialCharacters[Random.nextInt(0,32)].toString())
        }
    }
    for (i in mass){
        print(i)
    }
}