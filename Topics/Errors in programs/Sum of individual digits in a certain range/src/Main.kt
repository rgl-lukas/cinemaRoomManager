import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var userInput = scan.nextLine().trim()

    var sum = 0
    if (userInput.toIntOrNull() in 1..9999) {
        for (i in userInput.chars()) {
            sum += i.toInt() - '0'.code
        }
        println(sum)
    } else {
        println("Invalid Input")
    }
}