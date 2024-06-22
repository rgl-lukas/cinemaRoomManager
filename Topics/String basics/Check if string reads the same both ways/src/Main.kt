import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Read input string from the user
    val inputString = scanner.nextLine()

    // TODO: Check if the input string is a palindrome
    // Ignore case and whitespace when checking
    // Print 'true' if it is a palindrome, 'false' otherwise
    val clearString = inputString.replace("[^A-Za-z0-9]".toRegex(), "")
    val lowerString = clearString.lowercase()
    if (lowerString == lowerString.reversed()) println("true")
    else println("false")

}