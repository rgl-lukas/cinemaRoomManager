import java.util.*

fun main(args: Array<String>) {
    // Scanner object to get user input
    val reader = Scanner(System.`in`)

    // Read a number from the input
    val number = reader.nextInt()

    // TODO: Check if the number is in the range [10, 200] and print the result
    println(if (number in 10..200) "In range" else "Not in range")
}