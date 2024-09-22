fun main(){
    print("Введите количесво чисел :")
    val quan= readln().toInt()
    for (i in 1..quan) {
        println("Введите число для проверки")
        val namber= readln().toInt()
        if (namber % 2 == 0) {
            println("Ваше число четное")
        }
        else{
            println("Ваше число не четное")
        }
    }

}