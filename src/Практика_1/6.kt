fun main(){
    println("1 or 2 or 3 ")
    val orr= readln().toInt()
    if(orr==1){
        print("50 \n 10")
    }
    else if(orr==2){
        print("50 \n 10 \n 21")
    }
    else if(orr==3){
        for (i in 1..4) {
            val rnds = (0..100).random()
            println("$rnds ")
        }
    }
}