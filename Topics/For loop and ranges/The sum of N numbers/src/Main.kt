fun main() {
    val n = readln().toInt()
    var result = 0

    for (i in 1..n) {
        val number = readln().toInt()
        result += number
    }

    println(result)
}