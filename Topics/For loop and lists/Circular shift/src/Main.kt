import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val size: Int = scanner.nextInt()
    val A = mutableListOf<Int>()
    val tempA = mutableListOf<Int>()

    for (i in 1..size) {
        A.add(scanner.nextInt())
    }

    A.add(0, A.removeLast())

    for (i in A) {
        print("$i ")
    }
}