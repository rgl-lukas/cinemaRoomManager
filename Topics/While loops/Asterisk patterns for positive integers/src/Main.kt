import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Read integers from the standard input
    while (true) {
        val number = scanner.nextInt()

        // Check if the number is positive
        if (number <= 0) {
            break
        }

        // If the number is not positive, exit the loop
        repeat(number) {
            print("*")
        }
        println()
    }
}