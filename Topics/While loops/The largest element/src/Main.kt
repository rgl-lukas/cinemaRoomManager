fun main() {
    var max = 0

    while (true) {
        val n = readln().toInt()
        if (n == 0) {
            break
        }

        if (max < n) {
            max = n
        }
    }

    println(max)
}