package Практика_6

import kotlin.random.Random

    fun main(){
        val array=mutableListOf<Int>()
        println("Введите количесво чисел")
        val num= readln().toInt()
        for (i in 1..num){
            array.add(Random.nextInt(1,100))
        }
        var index1=Random.nextInt(0,num)
        var index2=Random.nextInt(0,num)
        println(array.joinToString())
        array[index1]=array[index2].also{array[index2]=array[index1]}
        println(array.joinToString())
    }

