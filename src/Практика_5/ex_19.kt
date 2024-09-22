package Практика_5
fun main() {
    println("Введите количество элементов в массиве:")
    val n = readln().toInt()

    val array = IntArray(n)

    for (i in 0 until n) {
        println("Введите элемент ${i + 1}:")
        array[i] = readln().toInt()
    }

    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }


    println("Отсортированный массив:")
    for (i in 0 until n) {
        println("Элемент ${i + 1}: ${array[i]}")
    }
}
