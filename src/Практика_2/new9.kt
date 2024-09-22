fun main() {
    val x = true
    val y = true
    val z = false

    if(!x && y){
        print("а) true\n")
    }
    else{
        print("a) false\n")
    }

    if(x || !y){
        print("б) true\n")
    }
    else{
        print("б) false\n")
    }

    if(x || y && z){
        print("в) true\n")
    }
    else {
        print("в) false\n")
    }
}