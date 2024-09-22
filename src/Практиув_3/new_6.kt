package Практиув_3
fun vis(namb:Int):String{
    if(namb%4==0){
        if(namb%100==0){
            if (namb%400==0){
                return("Ваш год высококостный")
            }
            return("Ваш год обычный")
        }
        return("Ваш год высококостный")
    }
    else{
        return("Ваш год обычный")
    }

}
fun main(){
    println("Введите ваш год")
    val namb= readln().toInt()
    println(vis(namb))
}