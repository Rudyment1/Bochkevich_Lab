fun main() {
    val a = true
    val b = false
    val c = false

    if(a || !(a && b)){
        print("а) true\n")
    }
    else{
        print("a) false\n")
    }

    if(!a || a &&(b || c)){
        print("б) true\n")
    }
    else{
        print("б) false\n")
    }

    if(a || b && !c){
        print("в) true\n")
    }
    else {
        print("в) false\n")
    }
}