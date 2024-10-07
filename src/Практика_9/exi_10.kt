fun main() {
    println("Введите строку:")
    val input = readln()

    var words=input.split(" ").map { it.replace(" ", "") }.toMutableList()
    var longestWord = ""
    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
        println(word)
    }
    println(longestWord)
    println("Самое длинное слово: \"$longestWord\"")
}