fun main() {
    val input = readln()
    if (input.isEmpty()) return
    println( when (input.first()) {
        'i' -> input.drop(1).toInt() + 1
        's' -> input.drop(1).reversed()
        else -> input
    }
    )
}