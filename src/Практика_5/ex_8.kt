package Практика_5
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) {
        a
    } else {
        gcd(b, a % b)
    }
}
fun main() {
    println("Введите первое число:")
    val first = readln().toInt()

    println("Введите второе число:")
    val second = readln().toInt()
    val result = gcd(first, second)
    println("Наибольший общий делитель чисел $first и $second: $result")
}