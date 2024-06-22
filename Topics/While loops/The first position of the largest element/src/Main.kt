import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var position = 0
    var max = Int.MIN_VALUE
    var positionOfMaxNumber = 0

    while (scanner.hasNextInt()) {
        position++
        val n = scanner.nextInt()
        if (max < n) {
            max = n
            positionOfMaxNumber = position
        }
    }

    println("$max $positionOfMaxNumber")
}