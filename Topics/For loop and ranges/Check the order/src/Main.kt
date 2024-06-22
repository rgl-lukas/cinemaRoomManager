fun main() {
    val n = readln().toInt()
    var temp = Int.MIN_VALUE
    var result = "YES"

    for (i in 1..n) {
        val number = readln().toInt()
        if (temp > number) {
            result = "NO"
        }
        temp = number
    }
    println(result)
}