fun main() {
    val n = readln().toInt()
    var larger = 0
    var perfect = 0
    var smaller = 0

    repeat(n) {
        val i = readln().toInt()
        when (i) {
            -1 -> smaller++
            0 -> perfect++
            1 -> larger++
        }
    }
    println("$perfect $larger $smaller")
}