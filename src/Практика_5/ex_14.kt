package Практика_5
import kotlin.random.Random
fun main() {
    for (i in 1..10) {
        val number = Random.nextInt(1, 101)
        println("$number ")
    }

}