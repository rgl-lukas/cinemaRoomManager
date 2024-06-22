fun main() {
    var sum = 0

    do {
        val input = readln().toInt()
        sum += input
    } while (input != 0)

    println(sum)
}