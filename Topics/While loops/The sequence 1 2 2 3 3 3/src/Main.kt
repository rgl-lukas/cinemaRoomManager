fun main() {
    val input = readln().toInt()
    var counter = 1
    var string = ""

    while (counter <= input) {
        repeat(counter) {
            string += "$counter "
        }
        counter++
    }
    println(string.substring(0, input * 2))
}