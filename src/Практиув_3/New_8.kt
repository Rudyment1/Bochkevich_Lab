package Практиув_3

fun main(){
    println("Введите расстояние в километрах")
    var kilo= readln().toDouble()
    println("Введите расстояние в Футах")
    var fut= readln().toDouble()
    kilo*=3281.84
    print(kilo)
    if(kilo>fut){
        println("Километры больше")
    }
    else if(kilo==fut){
        println("Они равны")
    }
    else{
        println("Футы больше")
    }
}