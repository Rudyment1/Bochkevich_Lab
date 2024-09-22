fun main(){
    println("1 or 2 or 3 or 4")
    val orr= readln().toInt()
    if (orr==1) {
        println("1 13 49")
    }
    else if (orr==3){
        for (i in 1..3) {
            val rnds = (0..100).random()
            print("$rnds  ")
        }
    }
    else if(orr==2)
        println("1  13  49")
    else if (orr==4){
        for (i in 1..4) {
            val rnds = (0..100).random()
            print("$rnds ")
        }
    }
}