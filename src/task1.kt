import kotlin.math.max

fun main(){
    print("Введите количесво чисел :")
    val quan= readln().toInt()
    var maxi=0
    for (i in 1..quan){
        print("Введите число:")
        var namb= readln().toInt()
        if (namb>maxi){
            maxi=namb
        }
    }
    print("Максимальное число введенное вами это $maxi ")
}