fun main() {
    val x = false
    val y = false
    val z = true

    // а
    if(x || y && !z){
        print("а) true\n")
    }
    else{
        print("a) false\n")
    }

    // г
    if(x && !y || z){
        print("г) true\n")
    }
    else{
        print("г) false\n")
    }

    //б
    if(!x && !y){
        print("б) true\n")
    }
    else {
        print("б) false\n")
    }

    // д
    if(x && (!y || z)){
        print("д) true\n")
    }
    else {
        print("д) false\n")
    }

    // в
    if(!(x && z) || y){
        print("в) true\n")
    }
    else {
        print("в) false\n")
    }

    // е
    if(x || (!(y || z))){
        print("е) true\n")
    }
    else {
        print("е) false\n")
    }
}