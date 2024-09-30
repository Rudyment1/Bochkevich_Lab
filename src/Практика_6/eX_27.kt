
fun main(){
    val array=mutableListOf<Int>()
    println("Введите количесво чисел")
    val num= readln().toInt()
    for (i in 1..num){
        println("Введите число")
        array.add(readln().toInt())
    }
    var index=0
    var maxi=0
    for (i in array){
        var n=0
        for (j in array) {
            if(j==i){
                n+=1
                if (n>maxi){
                    maxi=n
                    index=array.indexOf(j)
                }

            }
        }
    }
    println("${array[index]} это число попадается максимальное количество раз в массиве а именно:$maxi раза ")
}