package Практика_4
import kotlin.random.Random
fun main(){
    val rand=Random.nextInt(0,10)
    println("Введите число от (0-10)")
    var namb= readln().toInt()
    when {
        namb==rand-> println("Вы угадали число")
        namb!=rand-> println("Вы не угадали число")
    }
}