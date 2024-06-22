import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Read the user's comment from input
    val comment = scanner.nextLine()

    // Check if the comment is a valid single-line comment
    if (comment.startsWith("// ")) println("Valid") else println("Invalid")

    // Print the result

}