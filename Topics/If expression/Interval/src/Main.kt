import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    println(if (num in -14..12 || num in 15..16 || num >= 19) "True" else "False")
}