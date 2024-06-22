import java.util.*

fun main(args: Array<String>) {
    // Scanner object for reading inputs.
    val reader = Scanner(System.`in`)

    // TODO: Read two integers from the user.
    val a = reader.nextInt()
    val b = reader.nextInt()
    // TODO: Compare the two integers using Kotlin's relational operators.
    if (a > b)
        println("greater")
    else if (a < b)
        println("less")
    else
        println("equal")
    // TODO: Print out the outcome of the comparison ("equal", "greater", or "less").
}